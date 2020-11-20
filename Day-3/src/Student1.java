
public class Student1 {
	String name;
	int rno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public void displayDetails() {
		System.out.println(name + " " + rno);
	}

	public Student1(String name, int rno) {
		super();
		this.name = name;
		this.rno = rno;
	}

	public Student1() {

	}

}

class Record extends Student1 {
	String address;

	public Record(String name, int rno, String adress) {
		super(name, rno);
		this.address = adress;
	}
   public Record()
   {
	   
   }
	public void displayDetails() {
		System.out.println(name + " " + rno+" "+address);
	}

}
