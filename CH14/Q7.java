import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        boolean inputParsed = false;
        Scanner scanner = new Scanner(System.in);

        while (!inputParsed) {
            try {
                System.out.print("Enter an integer: ");
                String input = scanner.next();
                int number = Integer.parseInt(input);
                inputParsed = true;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            }
        }

        System.out.println("End of Program");
    }
}
*/
