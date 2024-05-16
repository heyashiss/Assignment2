import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();

        try {
            if (Math.abs(input % (Math.PI / 2)) < 1E-5) {
                throw new ArithmeticException("Input is very close to a multiple of PI/2");
            }

            double result = (Math.sin(input) + Math.cos(input)) / Math.tan(input);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
