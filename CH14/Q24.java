import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Q24 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\hp\\Desktop\\2241013365\\csw2\\Assignment_3\\abc1.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
    }
}
