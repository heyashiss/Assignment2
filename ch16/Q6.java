import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next().toLowerCase();
        String input2 = scanner.next().toLowerCase();
        String input1Upper = input1.toUpperCase();
        String input2Upper = input2.toUpperCase();

        System.out.println("Input 1: " + input1 + "\tInput 2: " + input2);
        System.out.println("Input 1 Upper Case: " + input1Upper + "\tInput 2 Upper Case: " + input2Upper);

        // Comparing the original strings with their uppercase versions ignoring case
        System.out.println("Comparison result for Input 1: " + input1.compareToIgnoreCase(input1Upper));
        System.out.println("Comparison result for Input 2: " + input2.compareToIgnoreCase(input2Upper));
    }
}
