import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for new diary entry
        System.out.println("Enter your diary entry:");
        String entry = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("Data/diary.txt", true);

            // Get current date and time
            String date = LocalDateTime.now().toString();

            // Append date and entry to the file
            fileWriter.write("\n" + date + "\n");
            fileWriter.write(entry);

            // Close the FileWriter
            fileWriter.close();

            System.out.println("Diary entry written to file.");
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
