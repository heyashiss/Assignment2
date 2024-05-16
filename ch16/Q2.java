public class Q2 {
    public static void main(String[] args) {
        String s = "abcd";

        // Replace 'a' with 's' and assign the result back to variable 's'
        s = s.replace("a", "s");

        // Print the modified string
        System.out.println(s);

        // Convert the string 's' to a CharSequence
        CharSequence cs = s;

        // Print the subsequence of 'cs' from index 0 to 3
        System.out.println(cs.subSequence(0, 3));

        // Print the length of the CharSequence 'cs'
        System.out.println(cs.length());
    }
}
