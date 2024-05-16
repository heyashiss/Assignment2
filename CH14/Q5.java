import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = null;

        try {
            System.out.println("Number + 2: " + (number + 2));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        System.out.println("End of Program");
    }
}
