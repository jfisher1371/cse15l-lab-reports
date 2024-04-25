import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int port = 8000; // Default port, you can change it as needed
        ChatServer chatServer = new ChatServer();

        try {
            Server.start(port, chatServer);  // Start the server with the ChatServer instance
            System.out.println("Server is running on http://localhost:" + port);
        } catch (IOException e) {
            System.err.println("Server could not start:");
            e.printStackTrace();
        }
    }
}
