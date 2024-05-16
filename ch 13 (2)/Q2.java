import java.util.Arrays;
/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 2)
*/

public class Q2 {
    public static void main(String[] args) {
        User arr[] = new User[3];
        arr[0] = new User("AShis", 20);
        arr[1] = new User("priyanshu", 22);
        arr[2] = new User("yash", 18);
        System.out.println("Before sorting--");
        for (User i : arr) {
            System.out.println(i);
        }
        Arrays.sort(arr);
        System.out.println("After sorting--");
        for (User i : arr) {
            System.out.println(i);
        }
    }
}

class User implements Comparable<User> {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return " Name : " + this.getName() + "\n Age : " + this.getAge();
    }

    public int compareTo(User u) {
        if (this.getAge() > u.getAge())
            return 1;
        else if (this.getAge() < u.getAge())
            return -1;
        else
            return 0;
    }
}

