/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 2)
*/
import java.util.HashMap;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> obj1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        obj1.put(1, new Book(224, "csw", "Mayur Ramgir", 700));
        obj1.put(2, new Book(243, "ad", "CLRS", 559));
        System.out.println(obj1);
        System.out.print("Enter book name to search:");
        String s = sc.next();
        for (Book book : obj1.values()) {
            if (book.name.equalsIgnoreCase(s)) {
                System.out.println(s + "  is present  in the library.");
                break;
            }
        }
        System.out.print("Enter key to remove:");
        int k = sc.nextInt();
        obj1.remove(k);
        System.out.println("After removing--\n" + obj1);
    }
}

class Book {
    long id;
    String name;
    String author;
    int quantity;

    Book(long id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String toString() {
        return "SKU : " + id + "\tName : " + name + "\tAuthor : " + author + "\tQuantity : " + quantity + "\n";
    }
}

