<?php

namespace App\Http\Controllers;

use App\Models\Role;
use App\Http\Requests\StoreRoleRequest;
use App\Http\Requests\UpdateRoleRequest;
use App\Models\User;
use Illuminate\Support\Facades\Auth;

class UserController extends Controller
{
    public function __construct()
    {
        $this->middleware('auth:api');
    }

    public function index()
    {
        $user = Auth::user()->makeVisible(['email',]);
        $followers = $user->followers()
            ->offset(0)
            ->limit(5)
            ->get() ?? '';
        $followings = $user->followings()
            ->offset(0)
            ->limit(5)
            ->get() ?? '';

        return response()->json([
            'user' => $user,
            'followers' => $followers,
            'followings' => $followings,
            'followersCount' => $user->followers()->count(),
            'followingsCount' => $user->followings()->count(),
        ]);
    }

    public function followers()
    {
        return response()->json([Auth::user()->followers]);
    }

    public function followings()
    {
        return response()->json([Auth::user()->followings]);
    }

    public function show(User $user)
    {
        $userAccount = Auth::user();
        if ($userAccount->id == $user->id) {
            $is_sub = 0;
        }
        elseif ($userAccount->followings()->find($user)!=null) {
            $is_sub = 1;
        }
        else $is_sub = -1;

        return response()->json([
            'user' => $user,
            'followers' => $user->followers()->count(),
            'followings' => $user->followings()->count(),
            'is_sub'=>$is_sub
        ]);
    }

    public function showTracks(User $user)
    {
        return response($user->tracksSpotify);
    }

    public function showArtist(User $user)
    {
        return response($user->artistsSpotify);
    }

    public function showAlbums(User $user)
    {
        return response($user->albumsSpotify);
    }

    public function update(UpdateRoleRequest $request, User $role)
    {
        //
    }


    public function destroy(User $user)
    {
        $user->delete();
        return redirect()->route('logout');
    }

    public function toggleFollow(User $user)
    {
        $u = Auth::user();
        $followings = $user->followers()->where('id', $u->id)->first();
        if (is_null($followings)) {
            $user->followers()->attach($u->id);
        } else {
            $user->followers()->detach($u->id);
        }
        return response($user);
    }
}
