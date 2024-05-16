import java.io.*;
import java.util.*;

public class UniqueFileCopyUtility {
    public static void copyContent(File sourceFile, File destinationFile) throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destinationFile);
            int data;
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
            System.out.println("File copied successfully.");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the source filename: ");
        String sourceFileName = scanner.next();
        File sourceFile = new File(sourceFileName);

        System.out.println("Enter the destination filename: ");
        String destinationFileName = scanner.next();
        File destinationFile = new File(destinationFileName);

        copyContent(sourceFile, destinationFile);
    }
}
