This is a simple, multi-client chat application built with Java. It allows multiple users to connect to a chat server and communicate in real time. The application is designed using socket programming and follows a client-server architecture.

Features:-
Real-time Communication: Users can send and receive messages instantly.
Multi-client Support: Multiple clients can join the chat room simultaneously.
Username Support: Each user is identified by a unique username.
Broadcast Messaging: Messages are broadcast to all connected clients.
Server Notifications: Notifies users when someone joins or leaves the chat room.
Threaded Client Handling: Each client connection is managed in a separate thread for efficient communication.

How It Works:-
The server listens for incoming client connections on a specified port.
Clients connect to the server and send messages, which are broadcast to all connected clients.
The server manages user sessions and notifies everyone when users join or leave.

Tech Stack:-
Language: Java
Core Concepts: Socket Programming, Multithreading, I/O Streams
Architecture: Client-Server Model

How to Run:-
Server:
Compile the Server code: javac Server.java ClientHandler.java, 
Start the server: java Server,
The server will start listening on port 1234 by default.
Client:
Compile the Client code: javac Client.java,
Run the client: java Client,
Enter your username when prompted, and start chatting!
