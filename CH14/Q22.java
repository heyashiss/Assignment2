import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new CustomCheckedException("Not eligible to vote");
            }

            System.out.println("Eligible to vote");
        } catch (CustomCheckedException e) {
            System.out.println("CustomCheckedException: " + e.getMessage());
        }
    }
}

class CustomCheckedException extends Exception {
    CustomCheckedException(String message) {
        super(message);
    }
}
