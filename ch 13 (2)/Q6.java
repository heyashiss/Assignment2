/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 2)
*/

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> SETr = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            SETr.add(sc.nextInt());
        }
        System.out.print("TreeSet Data : ");
        Iterator<Integer> itr = SETr.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nEnter Number to search:");
        int n = sc.nextInt();
        System.out.println(n + " is present: " + SETr.contains(n));
        System.out.println("Enter an element to delete");
        SETr.remove(sc.nextInt());
        System.out.println("After Deletion :" + SETr);

    }
}
