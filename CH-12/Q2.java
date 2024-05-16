/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 12- Object-Oriented Programming
*/

import java.util.Scanner;



class  Rectangle {
	private double  length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
double get_width() {
		return this.width;
	}
	double get_length() {
		return this.length;
	}
void set_width(double width) {
		this.width = width;
	}


	void set_length(double length) {
		this.length = length;
	}



	void display() {
		System.out.println("Length of Rectangle = " +length+" : Width of Rectangle ="+width);
	}

	double area() {
		return length * width;
	}

	double perimeter() {
		return 2 * (length + width);
	}

}

class Q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle : ");
		double length = in.nextDouble();


		System.out.print("Enter Width of Rectangle : ");
		double width = in.nextDouble();


		Rectangle rec1 = new Rectangle(length, width);

		System.out.println("Area =" + rec1.area());
		System.out.println("Perimeter =" + rec1.perimeter());
	}
}

