<?php

namespace app\Http\Controllers\Auth;
use App\Http\Controllers\Controller;
use Laravel\Socialite\Facades\Socialite;


class FacebookAuthController extends Controller
{
    public function redirectToFacebookProvider()
    {
        return Socialite::driver('facebook')->redirect();
    }

    public function handleFacebookProviderCallback(Request $request)
    {
        $user = Socialite::driver('facebook')->user();

        // Пошук або створення нового користувача в базі даних

        dd($user);

        return redirect()->intended('/dashboard');
    }
}
