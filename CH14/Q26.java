import java.lang.ClassNotFoundException;
import java.lang.NoSuchMethodException;
import java.lang.reflect.Method;

public class Q26 {
    public static void main(String[] args) {
        try {
            Class.forName("Q26"); // Corrected the class name to match the current class
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }

        try {
            Method m = Q26.class.getMethod("disp", String[].class);
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException: " + e.getMessage());
        }
    }

    public static void disp(String[] args) {
        // Method body
    }
}
