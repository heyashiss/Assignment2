import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for diary entry
        System.out.println("Enter your diary entry:");
        String entry = scanner.nextLine();

        try {
            File file = new File("Data/diary.txt");

            // Check if file already exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                FileWriter fw = new FileWriter(file);

                // Get current date
                LocalDate currentDate = LocalDate.now();

                // Write date and entry to file
                fw.write(currentDate.toString() + "\n");
                fw.write(entry);

                // Close the FileWriter
                fw.close();

                System.out.println("Diary entry written to file.");
            }
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
