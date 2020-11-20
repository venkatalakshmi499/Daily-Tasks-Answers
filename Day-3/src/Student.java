
public class Student { // class name student
	String name;
	int rno; // properties of student
	int marks;

	public static void main(String args[]) {
		MyRecord mr = new MyRecord(); // object for myrecord class
		mr.name = "Venky";
		mr.rno = 1234; // assigning a values to the variables
		mr.marks = 90;
		mr.percentage = 80;
		mr.display();

	}
}

class MyRecord extends Student { // student class is extended by myrecord class
	double percentage;

	public void display() // method to display all properties
	{
		System.out.println(name + " " + rno + " " + marks + " " + percentage + " ");
	}

}
