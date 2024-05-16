/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 1)
*/

public class Q1 {
    public static void main(String[] args) {
        Student_1<Integer> a = new Student_1<>("ASHIS", 1, 40);
        Student_1<String> b = new Student_1<>("PRIYANSHU", "2", 40);
        System.out.println(a + "\n" + b);
    }
}

class Student_1<T> {
    String name;
    T roll;
    int age;

    Student_1(String name, T roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + " Roll No.: " + this.roll + " Age:" + this.age;
    }
}
