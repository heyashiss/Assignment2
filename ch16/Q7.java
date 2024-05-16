import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String inputString = scanner.next();

        // Input the character to search
        System.out.println("Enter the character to search: ");
        char searchChar = scanner.next().charAt(0);

        // Convert string to character array
        char[] charArray = inputString.toCharArray();

        // Find first and last occurrence of the character
        int firstOccurrence = inputString.indexOf(searchChar);
        int lastOccurrence = inputString.lastIndexOf(searchChar);

        // Output the results
        System.out.println("First occurrence of " + searchChar + " is at index " + firstOccurrence);
        System.out.println("Last occurrence of " + searchChar + " is at index " + lastOccurrence);
        System.out.println(Arrays.toString(charArray));
    }
}
