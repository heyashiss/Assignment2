/*
Name : Ashis Kumar Sethi
Regd no.:2241019379
Section:28(CSE)
Ch 12- Object-Oriented Programming
*/

class College{
	String collegeName;
	String collegeLoc;
	College(String collegeName,String collegeLoc){
		this.collegeLoc=collegeLoc;
		this.collegeName=collegeName;
	}
}
class Student{
	int studentId;
	String studentName;
	College c;
	Student(int studentId,String studentName,College c){
		this.studentId=studentId;
		this.studentName=studentName;
		this.c=c;
	}
	void displayStudentInfo() {
		System.out.println("Student's ID num:"+studentId+"; Student Name: "+studentName+"; College name: "+c.collegeName+"; College Location:"+c.collegeLoc);
	}
	
}

public class Q5 {
	public static void main(String[] args) {
		College c1=new College("ITER","Bhubaneswar");
		College c2=new College("KIIT","Bhubaneswar");
		Student s1=new Student(1,"AShis",c1);
		Student s2=new Student(2,"Priyanshu",c2);
		s1.displayStudentInfo();
		s2.displayStudentInfo();
	}
}

