import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double input = scanner.nextDouble();

        try {
            if (input < 0 && Math.abs(input) % (Math.PI / 4) < 1E-5) {
                throw new ArithmeticException("Denominator cannot be zero");
            }

            double result = Math.sqrt(Math.abs(Math.sin(input) * Math.cos(input))) / (Math.tan(input) + 1);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
