import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        while (true) {
            System.out.println("***Menu***\n1. Append a string\n2. Insert a string at index\n" +
                    "3. Delete text between indices\n4. Reverse the text\n5. Replace text between indices\n6. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter string to append: ");
                    text.append(scanner.next());
                    System.out.println("After append: " + text);
                    break;
                case 2:
                    System.out.print("Enter index and string to insert: ");
                    int index = scanner.nextInt();
                    String insertString = scanner.next();
                    text.insert(index, insertString);
                    System.out.println("After insert: " + text);
                    break;
                case 3:
                    System.out.print("Enter indices to delete from: ");
                    int deleteFrom = scanner.nextInt();
                    int deleteTo = scanner.nextInt();
                    text.delete(deleteFrom, deleteTo);
                    System.out.println("After delete: " + text);
                    break;
                case 4:
                    System.out.println("After reverse: " + text.reverse());
                    break;
                case 5:
                    System.out.print("Enter string to replace and range: ");
                    String replaceString = scanner.next();
                    int replaceFrom = scanner.nextInt();
                    int replaceTo = scanner.nextInt();
                    text.replace(replaceFrom, replaceTo, replaceString);
                    System.out.println("After replace: " + text);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
