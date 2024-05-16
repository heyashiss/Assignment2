public class Q19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int search = 6;

        try {
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == search) {
                    System.out.println("Element found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Element not found in the array.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
