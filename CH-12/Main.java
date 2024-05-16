/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 12- Object-Oriented Programming
*/

import java.util.Scanner;

class Laptop {
	private String model;
	private double price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Model: " + this.model + " Price:" + this.price;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Laptop l1 = new Laptop();
		System.out.print("Enter Model Name:");
		l1.setModel(in.next());
		System.out.print("Enter Price:");
		l1.setPrice(in.nextDouble());
		System.out.println(l1);
	}
}

