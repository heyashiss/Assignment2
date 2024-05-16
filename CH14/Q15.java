import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(scanner.next());

            try {
                if (n == 0) {
                    throw new ArithmeticException("Division by zero error");
                }

                System.out.println("Result: " + (1.0 / n));
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
*/
