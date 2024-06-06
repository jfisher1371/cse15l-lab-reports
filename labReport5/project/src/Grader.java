import java.io.File;

public class Grader {
    public static void main(String[] args) {
        String filePath = getFilePath(args[0]);
        if (filePath != null) {
            processFile(filePath);
        } else {
            System.err.println("Error: File not found.");
        }
    }

    public static String getFilePath(String fileName) {
        File file = new File("../submissions/" + fileName);
        if (file.exists()) {
            return file.getAbsolutePath();
        } else {
            return null;
        }
    }

    public static void processFile(String filePath) {
        // Line 45: File processing logic
        System.out.println("Processing file at: " + filePath);
        // More processing code...
    }
}