import java.util.Scanner;

/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 12- Object-Oriented Programming
*/

class Point {
	double X;
	double Y;

	Point(double X, double Y) {
		this.X = X;
		this.Y = Y;
	}

	Point(Point point) {
		this.X = point.X;
		this.Y = point.Y;
	}

	double get_X() {
		return this.X;
	}

	double get_Y() {
		return this.Y;
	}

	void set_X(double X) {
		this.X = X;
	}

	void set_Y(double Y) {
		this.Y = Y;
	}

}

class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X: ");
		double X = sc.nextDouble();

		System.out.print("Enter Y: ");
		double Y = sc.nextDouble();

		Point p1 = new Point(X, Y);
		System.out.println("Point=(" + p1.get_X() + ", " + p1.get_Y()+")");

		Point p2 = new Point(p1);
		System.out.println("Point= (" + p2.get_X() + ",Y=" + p2.get_Y()+")");
	}
}


