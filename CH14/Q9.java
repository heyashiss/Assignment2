import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            System.out.println("Result of division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        System.out.println("End of Program");
    }
}
