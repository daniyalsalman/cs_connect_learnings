const { WebSocketServer } = require('ws');

// 1. Start the server on port 8080
const wss = new WebSocketServer({ port: 8080 });

wss.on('connection', (socket) => {
  console.log('New client connected');

  socket.on('message', (data) => {
    // data is a Buffer by default; convert it to a string
    const message = data.toString();
    console.log(`Received: ${message}`);
    console.log(data);
    

    // 2.  Loop send the message
    wss.clients.forEach((client) => {
      // Only send to clients that are currently connected (OPEN)
      if (client.readyState === 1) { 
        client.send(message);
      }
    });
  });

  socket.on('close', () => console.log('Client disconnected'));
});

console.log('WebSocket server is running on ws://localhost:8080');