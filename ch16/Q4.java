import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        while (true) {
            System.out.println("***Menu***\n1) Add a substring at a specified position\n" +
                    "2) Remove a range of characters from the string.\n" +
                    "3) Modify a character at a specified index.\n" +
                    "4) Concatenate another string at the end.\n" +
                    "5) Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter string and index to insert: ");
                    int insertIndex = scanner.nextInt();
                    String insertString = scanner.next();
                    text.insert(insertIndex, insertString);
                    System.out.println("After insert: " + text);
                    break;
                case 2:
                    System.out.print("Enter indices to delete from: ");
                    int deleteFrom = scanner.nextInt();
                    int deleteTo = scanner.nextInt();
                    text.delete(deleteFrom, deleteTo);
                    System.out.println("After delete: " + text);
                    break;
                case 3:
                    System.out.print("Enter index and character to modify: ");
                    int modifyIndex = scanner.nextInt();
                    char newChar = scanner.next().charAt(0);
                    text.setCharAt(modifyIndex, newChar);
                    System.out.println("After modify: " + text);
                    break;
                case 4:
                    System.out.print("Enter string to concatenate: ");
                    text.append(scanner.next());
                    System.out.println("After append: " + text);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
