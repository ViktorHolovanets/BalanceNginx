<?php

namespace app\Http\Controllers\Auth;
use App\Http\Controllers\Controller;
use App\Models\User;
use Google_Client;
use Google_Service_Oauth2;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Hash;


class GoogleAuthController extends Controller
{

    public function redirectToGoogle()
    {
        $client = new Google_Client();
        $client->setClientId(config('services.google.client_id'));
        $client->setClientSecret(config('services.google.client_secret'));
        $client->setRedirectUri(config('services.google.redirect'));
        $client->addScope(Google_Service_Oauth2::USERINFO_EMAIL);
        $client->addScope(Google_Service_Oauth2::USERINFO_PROFILE);

        return redirect($client->createAuthUrl());
    }

    public function handleGoogleCallback()
    {
        $client = new Google_Client();
        $client->setClientId(config('services.google.client_id'));
        $client->setClientSecret(config('services.google.client_secret'));
        $client->setRedirectUri(config('services.google.redirect'));

        $oauth = new Google_Service_Oauth2($client);
        $token = $client->fetchAccessTokenWithAuthCode(request('code'));

        $user = $oauth->userinfo->get();
        $userNew=User::find($user->id);

        if(is_null($userNew)){
            $userNew = User::create([
                'id'=>$user->id,
                'name' => $user->name,
                'image'=>$user->picture,
                'email' => $user->email,
                'password' => Hash::make(bcrypt(str_random(16))),
                'role_id' => $user->role_id,
            ]);
        }


        $token = Auth::login($userNew);
        dd($token);
        return response()->json([
            'status' => 'success',
            'message' => 'User created successfully',
            'authorisation' => [
                'token' => $token,
                'type' => 'bearer',
            ]
        ]);
    }
}
