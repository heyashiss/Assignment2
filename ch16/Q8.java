import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter two strings: ");
        String firstString = scanner.next();
        String secondString = scanner.next();

        // Concatenate and print the strings
        System.out.println("Concatenated string: " + firstString + secondString);
        System.out.println("Using concat() method: " + firstString.concat(secondString));

        // Input index number
        System.out.println("Enter index Number: ");
        int index = scanner.nextInt();

        // Print character at the specified index in the first string
        System.out.println("Character at index " + index + " in the first string: " + firstString.charAt(index));
    }
}
