import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 9999;
        
        // Declare socket outside try block
        Socket socket = null;
        
        try {
            // Connect to server      
            socket = new Socket(hostname, port);
            System.out.println("Connected to server at " + hostname + ":" + port);
            
            // Setup output stream
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeBytes("Hello, Server!\n");
            System.out.println("Message sent to server: Hello, Server!");
            
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
        
        // Close socket safely
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                System.err.println("Error closing socket: " + e.getMessage());
            }
        }
    }
}