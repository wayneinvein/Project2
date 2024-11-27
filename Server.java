import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public void startServer() {
        try {
            System.out.println("Server is running...");
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept(); // Accept client connections
                System.out.println("A new user has connected!!");
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start(); // Start client handler in a new thread
            }
        } catch (IOException e) {
            System.err.println("Error accepting client connection: " + e.getMessage());
        }
    }

    public void closeServerSocket() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Server server = new Server(serverSocket);
            server.startServer();
        } catch (IOException e) {
            System.err.println("Error starting the server: " + e.getMessage());
        }
    }
}
