/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 1)
*/

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        S2[] arr = new S2[3];
        System.out.println("Enter 3 student detail:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = new S2(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        System.out.print("Enter student data to search: ");
        S2 s = new S2(sc.next(), sc.nextInt(), sc.nextDouble());
        boolean isFound = false;
        for (int i = 0; i < 3; i++) {
            if (arr[i].compareTo(s) == 0) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}

class S2 implements Comparable<S2> {
    String name;
    int rollno;
    double total_mark;

    S2(String n, int r, double m) {
        this.name = n;
        this.rollno = r;
        this.total_mark = m;
    }

    public int compareTo(S2 stu) {
        return this.rollno == stu.rollno && this.name.equals(stu.name) && this.total_mark == stu.total_mark ? 0 : -1;
    }
}

 */
