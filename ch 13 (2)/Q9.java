import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        HashSet<Integer> uniqueSet = new HashSet<>();
        HashSet<Integer> repeatedSet = new HashSet<>();
        for (int num : arr) {
            if (!uniqueSet.add(num)) {
                repeatedSet.add(num);
            }
        }
        System.out.println("Repeated numbers: " + repeatedSet);
    }
}
