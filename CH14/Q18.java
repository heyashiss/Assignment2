public class Q18 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        recursive(arr, 5);
        System.out.println("End of Program");
    }

    static void recursive(int[] arr, int n) {
        try {
            if (n < 0) {
                throw new ArrayIndexOutOfBoundsException("Index cannot be negative");
            }

            // Output the element at index n - 1
            System.out.println(arr[n - 1]);

            // Recursive call with n - 1
            recursive(arr, n - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
