public class Q27 {
    public static void main(String[] args) {
        try {
            Object obj = 5;
            System.out.println("String representation of obj: " + obj.toString());
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
        System.out.println("End of program");
    }
}
