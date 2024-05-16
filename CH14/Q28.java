
public class Q28 {
    public static void main(String[] args) {
        try {
            num(5);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: " + e.getMessage());
        }
        System.out.println("End of program");
    }

    static void num(int num) {
        num(num);
    }
}
