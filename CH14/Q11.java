import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double input = scanner.nextDouble();

        try {
            if (input < 0 || Math.abs(input % (Math.PI / 4)) < 1E-5) {
                throw new ArithmeticException("Denominator cannot be zero or the logarithm of a negative number cannot be found");
            }

            double result = Math.log(Math.sin(input) + Math.cos(input)) / (Math.tan(input) - (1 / Math.tan(input)));
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
*/
