import java.util.*;
/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 2)
*/

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> obj = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 student detail");
        for (int i = 0; i < 2; i++) {
            Student s1 = new Student();
            s1.setName(in.next());
            s1.setAge(in.nextInt());
            s1.setMarks(in.nextDouble());
            obj.add(s1);
        }
        for (Student ele : obj) {
            System.out.println(ele);
        }
        System.out.println("Enter Student details to search:");
        Student temp = new Student();
        temp.setName(in.next());
        temp.setAge(in.nextInt());
        temp.setMarks(in.nextDouble());
        for (Student i : obj) {
            if (i.equals(temp)) {
                System.out.println("Found");
            }
        }
        System.out.println("No. of objects in list:" + obj.size());
        System.out.println("Enter Student details to remove:");
        temp.setName(in.next());
        temp.setAge(in.nextInt());
        temp.setMarks(in.nextDouble());
        for (Student i : obj) {
            if (i.equals(temp)) {
                obj.remove(i);
            }
        }
    }
}

class Student {
    String name;
    int age;
    double mark;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return this.mark;
    }

    public void setMarks(double mark) {
        this.mark = mark;
    }

    public String toString() {
        return "Student Name : " + this.getName() + "\n" +
                "Student Age: " + this.getAge() + "\n" +
                "Student Marks : " + this.getMarks();
    }

    public boolean equals(Student obj1) {
        return this.age == obj1.age && this.mark == obj1.mark && this.name.equals(obj1.name);
    }
}

/
