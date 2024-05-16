/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 12- Object-Oriented Programming
*/

interface Vehicle {
    abstract void accelerate();

    abstract void brake();
}

class Car implements Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating at 2m/s^2");
    }

    public void brake() {
        System.out.println("Car Brake is getting applied");
    }

    public void accelerate(double speed) {
        System.out.println("Car is accelerating at speed:" + speed);
    }

    public void accelerate(int duration) {
        System.out.println("Car is accelerating for duartion:" + duration);
    }
}

class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is accelerating at 1m/s^2");
    }

    public void accelerate(double speed) {
        System.out.println("Bicycle is accelerating at speed:" + speed);
    }

    public void accelerate(int duration) {
        System.out.println("Bicycle is accelerating for duration:" + duration);
    }

    public void brake() {
        System.out.println("Bicycle Brake is getting applied");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car C = new Car();
        Bicycle B = new Bicycle();
        C.accelerate();
        C.brake();
        B.accelerate();
        B.brake();
        C.accelerate(90.0);
        C.accelerate(6);
    }
}

