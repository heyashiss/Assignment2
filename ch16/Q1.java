public class MemoryExample {
    public static void main(String[] args) {
        // Explicitly invoking garbage collection
        System.gc();

        // Creating a new String object using the 'new' keyword
        String s = new String("Hello");
        System.out.println("Memory available after creating 'Hello' with 'new': " + Runtime.getRuntime().freeMemory());

        // Creating another String object using the 'new' keyword
        String s3 = new String("Hello");
        System.gc();

        // Creating a String object without 'new' keyword (using string literal)
        String s1 = "Hello";
        System.out.println("Memory available without using 'new': " + Runtime.getRuntime().freeMemory());

        // Creating another String object without 'new' keyword (using string literal)
        String s2 = "Hello";

        // Comparing string references
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s == s1: " + (s == s1));
        System.out.println("s == s3: " + (s == s3));
    }
}
