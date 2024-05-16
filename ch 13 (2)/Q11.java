import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Initialize the map with default values
        for (int i = 1; i <= 10; i++) {
            numberMap.put(i, -1);
        }

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Update the map with provided elements
        for (int i = 0; i < n; i++) {
            numberMap.put(numbers[i], i);
        }

        // Find the smallest missing number
        int minMissing = findSmallestMissing(numberMap);

        System.out.println("Smallest missing number: " + minMissing);
    }

    // Method to find the smallest missing number
    private static int findSmallestMissing(HashMap<Integer, Integer> map) {
        int minMissing = 10;
        for (int key : map.keySet()) {
            if (map.get(key) == -1 && minMissing > key) {
                minMissing = key;
            }
        }
        return minMissing;
    }
}
