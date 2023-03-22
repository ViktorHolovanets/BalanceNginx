<?php

namespace App\Http\Controllers;

use App\Models\Comment;
use App\Http\Requests\StoreCommentRequest;
use App\Http\Requests\UpdateCommentRequest;
use App\Http\Controllers\Controller;
use Exception;
use Illuminate\Support\Facades\Cache;
use Illuminate\Support\Facades\Log;
use Illuminate\Support\Facades\Storage;
use SocketIO\Emitter;
use TCG\Voyager\Models\Post;

class TestSocketIo extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        try {
            $redis = new \Redis(); // Using the Redis extension provided client
            $redis->connect('redis', '6379');
            $emitter = new Emitter($redis);
            $emitter->broadcast->emit('my-name-is', [
                'username' => 'serverApi: ' . env('NAME', ' Some api Server '),
                'message' => 'Hello From API'
            ]);
        } catch (Exception $exception) {
            Log::error($exception->getMessage());
        }
    }
}
