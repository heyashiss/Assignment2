import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String inputString = scanner.next();

        while (true) {
            // Display menu
            System.out.println("1. Convert to Lowercase\n" +
                               "2. Convert to Uppercase\n" +
                               "3. Search for a character\n" +
                               "4. Concatenate with another string\n" +
                               "5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Convert to lowercase and display
                    System.out.println("Lowercase: " + inputString.toLowerCase());
                    break;
                case 2:
                    // Convert to uppercase and display
                    System.out.println("Uppercase: " + inputString.toUpperCase());
                    break;
                case 3:
                    // Search for a character
                    System.out.println("Enter the character to search:");
                    char searchChar = scanner.next().charAt(0);
                    System.out.println("First occurrence of " + searchChar + " is at index " + inputString.indexOf(searchChar));
                    break;
                case 4:
                    // Concatenate with another string
                    System.out.println("Enter the string to concatenate:");
                    String stringToConcatenate = scanner.next();
                    System.out.println("Concatenated String: " + inputString.concat(stringToConcatenate));
                    break;
                case 5:
                    // Exit the program
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
