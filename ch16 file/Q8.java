import java.io.File;

public class UniqueFileRenamer {
    public static void main(String[] args) {
        File sourceFile = new File("Data/diary.txt");
        File destinationFile = new File("Data/diary2.txt");

        boolean success = sourceFile.renameTo(destinationFile);

        if (success) {
            System.out.println("File successfully renamed.");
        } else {
            System.out.println("Operation failed. Check file paths.");
        }
    }
}
