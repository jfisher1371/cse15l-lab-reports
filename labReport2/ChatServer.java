import java.net.URI;  
import java.net.URLDecoder;  
import java.util.ArrayList; 


class ChatServer implements URLHandler {
    private ArrayList<String> messages = new ArrayList<>();  // Store messages


    public String handleRequest(URI uri) {
        try {
            String response = "";
            String path = uri.getPath();  // Get the path from the URI

            if (path.equals("/add-message")) {
                String query = uri.getQuery();  // Get the query from the URI
                String[] params = query.split("&");  // Split parameters by '&'

                String message = "";
                String user = "";

                // Loop through each parameter to find 's' and 'user' values
                for (String param : params) {
                    String[] keyValue = param.split("=");  // Split each parameter into key-value pairs

                    if (keyValue[0].equals("s")) {
                        message = URLDecoder.decode(keyValue[1], "UTF-8");  // Decode the message
                    } else if (keyValue[0].equals("user")) {
                        user = URLDecoder.decode(keyValue[1], "UTF-8");  // Decode the user
                    }
                }

                // Format and add the message to the list
                messages.add(user + ": " + message);

                // Create a response containing all messages
                for (String msg : messages) {
                    response += msg + "\n";
                }
            } else {
                // If no specific action is found, show all messages
                for (String msg : messages) {
                    response += msg + "\n";
                }
            }
            return response;  // Return the formatted response
        } catch (Exception e) {
            return "Error processing request: " + e.getMessage();  
        }
    }
}