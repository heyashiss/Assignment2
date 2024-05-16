import java.io.File;
import java.util.Scanner;

public class DirectoryListing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);
        listFiles(directory);
    }

    // Recursive function to list all files and subdirectories
    public static void listFiles(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            System.out.println(file.getName() + " (Directory)");
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    listFiles(subFile);
                }
            }
        }
    }
}
