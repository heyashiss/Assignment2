public class Q3 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (s == null) {
                throw new CustomNullPointerException("CustomNullPointerException: String is null");
            }
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

class CustomNullPointerException extends Exception {
    CustomNullPointerException(String message) {
        super(message);
    }
}

