import React, { useState } from 'react';
import SockJsClient from 'react-stomp';

const SOCKET_URL = 'https://localhost/ws-message';

const App = () => {
  
  const [message, setMessage] = useState('Server messages will appear here!');

  let onConnected = () => {
    console.log("Connected!!")
  }

  let onMessageReceived = (msg) => {
    setMessage(msg.message);
  }

  return (
    <div>
      <SockJsClient
        url={SOCKET_URL}
        topics={['/topic/message']}
        onConnect={onConnected}
        onDisconnect={console.log("Disconnected!")}
        onMessage={msg => onMessageReceived(msg)}
        debug={false}
      />
      <h1>Real time Notification System using WebSocket (Spring Boot(Java), React.Js)</h1>
      <div>{message}</div>
    </div>
  );


}

export default App;