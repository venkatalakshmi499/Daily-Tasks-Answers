
public class University {
	String universityName = "JNTUk";
	static int noOfDepartments = 4;

	public void universityCode() {
		System.out.println("JNTH");
	}

	static class Electronics {
		int noOfSections = 3;
		int noOfFaculty = 30;

		public void display() {
			System.out.println("This is Electronics Department");
		}

		public static void deptId() {
			System.out.println("ECE");
		}

	}

	static class Cse {
		int noOfSections = 3;
		int noOfFaculty = 40;

		public void display() {
			System.out.println("This is Computer Science Department");
		}

		public static void deptId() {
			System.out.println("CSE");

		}
	}
	static class Electrical{
		int noOfSections=2;
		int noOfFaculty=20;
		public void display()
		{
			System.out.println("This is Electronics and Electrical Department");
		}
		public static void deptId()
		{
			System.out.println("EEE");
	}
	}
	static class Mechanical{
		int noOfSections=2;
		int noOfFaculty=20;
		public void display()
		{
			System.out.println("This Mechanical Department");
		}
		public static void deptId()
		{
			System.out.println("MECH");
	     }
	 }
	}
