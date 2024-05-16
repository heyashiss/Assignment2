/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 1)
*/

public class Q2 {
    public static void main(String[] args) {
        Book a = new Book(1, "Java", 499 );
        Book b = new Book(2, "Python", 599);
        System.out.println(a + "\n" + b);
        System.out.println("Is Price Equal :" + a.equals(b));
    }
}

class Book {
    int bookId;
    String bookName;
    double price;

    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public boolean equals(Book b) {
        return this.price = b.price;
    }

    public String toString() {
        return "Book SKU: " + this.bookId + " Name: " + this.bookName + " Price:" + this.price;
    }
}
