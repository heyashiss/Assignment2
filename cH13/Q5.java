/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 1)
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        S3[] arr = new S3[3];
        System.out.println("Enter 3 student detail:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = new S3(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        boolean b;
        for (int i = 0; i < 3; i++) {
            b = false;
            for (int j = 0; j < 2 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    S3 temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    b = true;
                }
            }
            if (!b)
                break;
        }
        System.out.println("Sorted in ascending order by Roll No : ");
        for (int i = 0; i < 3; i++)
            System.out.println(arr[i]);

    }
}

class S3 implements Comparable<S3> {
    String name;
    int rollno;
    double total_mark;

    S3(String n, int r, double m) {
        this.name = n;
        this.rollno = r;
        this.total_mark = m;
    }

    public int compareTo(S3 stu) {
        return this.rollno - stu.rollno;
    }

    public String toString() {
        return "Name:" + this.name + "\n Roll No.:" + this.rollno + "\n Total Marks =" + this.total_mark;
    }
}

