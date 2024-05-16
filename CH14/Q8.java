import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new ArithmeticException("Square root of a negative number cannot be found");
            }

            System.out.println("Square root of " + number + " is: " + Math.sqrt(number));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        System.out.println("End of Program");
    }
}
