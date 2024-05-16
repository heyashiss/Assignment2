import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        System.out.print("Enter the base string: ");
        String baseString = scanner.next();
        System.out.print("Enter number of concatenations: ");
        int numberOfConcatenations = scanner.nextInt();

        runStringBuilder(stringBuilder, baseString, numberOfConcatenations);
        runStringBuffer(stringBuffer, baseString, numberOfConcatenations);
    }

    public static void runStringBuilder(StringBuilder stringBuilder, String baseString, int numberOfConcatenations) {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < numberOfConcatenations; i++) {
            stringBuilder.append(baseString);
        }

        long end = System.currentTimeMillis();

        System.out.println("String Builder");
        System.out.println("Time: " + (end - begin) + "ms");
        System.out.println("Final String Length: " + stringBuilder.length());
    }

    public static void runStringBuffer(StringBuffer stringBuffer, String baseString, int numberOfConcatenations) {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < numberOfConcatenations; i++) {
            stringBuffer.append(baseString);
        }

        long end = System.currentTimeMillis();

        System.out.println("String Buffer");
        System.out.println("Time: " + (end - begin) + "ms");
        System.out.println("Final String Length: " + stringBuffer.length());
    }
}
