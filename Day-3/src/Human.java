
public class Human {
	String name;
	char gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Human(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	public Human() {

	}

	public void chooseElder(int wage,int mage) {
             System.out.println("The elder one is :"+Math.min(wage, mage));
	}

}

class Women extends Human {
	int wage;
	public Women() {
		
	}
	public Women(String name, char gender, int wage) {
		super(name, gender);
		this.wage = wage;	
	}
	public void chooseElder(int wage,int mage)
	{
		System.out.println("The elder one is :"+Math.min(wage, mage));
	}

}

class Man extends Human {
	int mage;
	public Man()
	{
		
	}

	public Man(String name, char gender, int mage) {
		super(name, gender);
		this.mage = mage;
		
	}
	public void chooseElder(int wage,int mage)
	{
		System.out.println("The elder one is :"+Math.min(wage, mage));
	}

}
