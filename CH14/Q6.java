public class Q6 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
        System.out.println("End of program");
    }
}
