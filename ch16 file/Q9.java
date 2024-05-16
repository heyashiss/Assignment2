import java.util.Scanner;
import java.io.File;
import java.util.Date;

public class FileMetadataViewer {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please provide the file name: ");
        String inputFileName = inputScanner.nextLine();
        File targetFile = new File(inputFileName);
        if (targetFile.exists()) {
            System.out.println("Size of File: " + targetFile.length() + " bytes");
            System.out.println("Last Modified Date: " + new Date(targetFile.lastModified()));
            System.out.println("Is the file readable? " + targetFile.canRead());
            System.out.println("Is the file writable? " + targetFile.canWrite());
        } else {
            System.out.println("The specified file does not exist.");
        }
    }
}
