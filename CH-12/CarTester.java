import java.util.Scanner;
/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 12- Object-Oriented Programming
*/

//Q1




class Car {
	private String Make;
	private String  Model;

			Car(String  Make, String  Model) {
				this.Make = Make;
				this.Model = Model;
	}

				String get_Make() {
		return this.Make;
	}

			String  get_Model() {
		return this.Model;
	}

			void set_Make(String Make) {
		this .Make = Make;
	}

			void set _Model(String Model) {
		this.Model = Model;
	}

	void display() {
		System.out.println("Brand: "+Make + "Model:" +Model);
	}

}

class CarTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Brand for myCar1: ");
		String Make1 = in.next();
		System.out.print("Enter Model for myCar1: ");
		String Model1 = in.next();
		Car myCar1 = new Car(Make1, Model1);

		Car myCar2 = new Car(null, null);// as given in question
		System.out.println("For myCar1");
		myCar1.display();
		System.out.println("For myCar2");
		myCar2.display();
		System.out.print("Enter Brand for myCar2: ");
		String Make2 = in.next();
		System.out.print("Enter Model for myCar2: ");
		String Model2 = in.next();
		myCar2.set_Make(Make2);
		myCar2.set_Model(Model2);
		System.out.println("New myCar2");
		myCar2.display();

	}
}


