/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 13- Generics and Collections(Part 2)
*/
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Car> obj1 = new ArrayList<>();
        obj1.add(new Car(2018, "Hyundai", 10));
        obj1.add(new Car(2016, "Audi", 45));
        obj1.add(new Car(2015, "Kia", 20));
        obj1.add(new Car(2015, "BMW", 55));
        obj1.add(new Car(2023, "Mazda", 13));
        Collections.sort(obj1);
        System.out.println("Sorted List:\n" + obj1);

    }
}

class Car implements Comparable<Car> {
    private int ModalNo;
    private String name;
    private int stock;

    Car(int modalno, String nm, int stk) {
        this.ModalNo = modalno;
        this.name = nm;
        this.stock = stk;
    }

    public int compareTo(Car c) {
        return this.stock - c.stock;
    }

    public String toString() {
        return "Model:" + this.ModalNo + "\nName:" + this.name + "\nStock:" + this.stock + "\n";
    }
}

/
