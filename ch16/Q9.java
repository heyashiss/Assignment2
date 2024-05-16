import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        // Input two words
        System.out.println("Enter two words:");
        String word1 = scanner.next();
        String word2 = scanner.next();

        // Find the first occurrence of word1 in the string
        int index1 = inputString.indexOf(word1);
        System.out.println("First occurrence of " + word1 + " is at index " + index1);

        // Find the first occurrence of word2 in the string after the occurrence of word1
        int index2 = inputString.indexOf(word2, index1 + word1.length());

        // Create modified string by removing word2 from the original string
        String modifiedString = inputString.substring(0, index2) + inputString.substring(index2 + word2.length());

        // Output the modified string
        System.out.println("Modified String: " + modifiedString);
    }
}
