import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        int port = 9999;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Wait for one client (blocks here until client connects)
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Setup streams
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read one line from client
            String message = in.readLine();
            System.out.println("Received from client: " + message);

            // Send reply to client
            out.println("Hello, Client! I received: " + message);

            // Close connection
            clientSocket.close();
            System.out.println("Connection closed.");

        } catch (IOException e) {
            System.err.println("Error occurred while listening for client connections: " + e.getMessage());
        }
    }
}