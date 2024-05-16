public class Q16 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            // Trying to access an element outside the bounds of the array
            System.out.println("Element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception if it occurs
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("End of program");
    }
}
