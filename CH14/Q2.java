import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        boolean found = false;

        try {
            int length = inputString.length();

            for (int i = 1; i < length; i++) {
                if (Character.isDigit(inputString.charAt(i)) && Character.isLetter(inputString.charAt(i - 1))) {
                    System.out.print(inputString.charAt(i) + "  ");
                    found = true;
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        if (!found) {
            System.out.println("No digits following letters were found.");
        }
    }
}
*/
