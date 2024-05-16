import java.util.InputMismatchException;
import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }

        System.out.println("End of program");
    }
}
