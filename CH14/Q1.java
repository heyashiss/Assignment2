public class Q1 {
    public static void main(String[] args) {
        try {
            String s = null;
            if (s != null) {
                System.out.println(s.length());
            } else {
                System.out.println("String is null.");
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("End of Program");
    }
}
