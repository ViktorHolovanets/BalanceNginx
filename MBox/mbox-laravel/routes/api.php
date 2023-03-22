<?php

use app\Http\Controllers\Auth\AuthController;
use App\Lib\ProcessingResponseApi\ProcessingResponseSpotify;
use App\Lib\Response\Error;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::resource('users',\App\Http\Controllers\UserController::class);
Route::post('/users/{user}/toggle', [\App\Http\Controllers\UserController::class,'toggleFollow']);
Route::post('/users/followers', [\App\Http\Controllers\UserController::class,'followers']);
Route::post('/users/followings', [\App\Http\Controllers\UserController::class,'followings']);
Route::get('/users/{user}/tracks', [\App\Http\Controllers\UserController::class,'showTracks']);
Route::get('/users/{user}/artist', [\App\Http\Controllers\UserController::class,'showArtist']);
Route::get('/users/{user}/albums', [\App\Http\Controllers\UserController::class,'showAlbums']);



Route::resource('tracks',\App\Http\Controllers\Music\Spotify\TrackController::class);
Route::post('/tracks/{track}/lyricks', [\App\Http\Controllers\Music\Spotify\TrackController::class,'lirycks']);



Route::resource('artists',\App\Http\Controllers\Music\Spotify\ArtistController::class);
Route::resource('albums',\App\Http\Controllers\Music\Spotify\AlbumController::class);

Route::post('/search', function (Request $request) {
    $request->validate([
        'q' => 'string',
        'type' => 'string',
    ]);
    $var = \App\Lib\ApiSpotify::search($request);

    return response()->json([
        'tracks'=>ProcessingResponseSpotify::tracks($var),
        'artists'=>ProcessingResponseSpotify::artists($var),
        'albums'=>ProcessingResponseSpotify::albums($var),
    ]);


});


Route::controller(\App\Http\Controllers\Auth\AuthController::class)->group(function () {
    Route::post('login', 'login');
    Route::post('register', 'register');
    Route::post('logout', 'logout')->name('logout');
    Route::post('refresh', 'refresh');
});
Route::get('/auth/google', [\App\Http\Controllers\Auth\GoogleAuthController::class,'redirectToGoogle']);
Route::get('/auth/google/callback', [\App\Http\Controllers\Auth\GoogleAuthController::class,'handleGoogleCallback']);

Route::get('login/facebook', [\App\Http\Controllers\Auth\FacebookAuthController::class,'redirectToFacebookProvider']);
Route::get('login/facebook/callback', [\App\Http\Controllers\Auth\FacebookAuthController::class,'handleFacebookProviderCallback']);


Route::get('/notlogin',function (){
    return Error::unauthorized();
})->name('login');


Route::get('/test/socket/io', [\App\Http\Controllers\TestSocketIo::class,'index']);