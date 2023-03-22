const express = require('express');
const app = express();
const server = require('http').createServer(app);
const io = require('socket.io')(server);
const { createAdapter } = require('@socket.io/redis-adapter');
const { createClient } = require('redis');
const port = process.env.PORT || 3000;
const serverName = process.env.NAME || 'Unknown';

const pubClient = createClient({ host: 'redis', port: 6379 });
const subClient = pubClient.duplicate();

io.adapter(createAdapter(pubClient, subClient));

server.listen(port, () => {
  console.log('Server listening at port %d', port);
  console.log('Hello, I\'m %s, how can I help?', serverName);
});

// Chatroom
let numUsers = 0;

io.on('connection', socket => {

  console.log("new: " + socket.handshake.address )


  // Когда кто то устанавливает соединение с сокетом
  // я отсылаю ему сообщение
  socket.emit('my-name-is', serverName);


  socket.on('new-message', data => {
    console.log(data)
    // we tell the client to execute 'new message'
    socket.broadcast.emit('new-message', {
      username: " Test Message ",
      message: data
    });

    socket.emit('new-message', {
      username: " Test Message ",
      message: data
    })
  });
});