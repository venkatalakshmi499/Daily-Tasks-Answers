
public class Contact { // class name contact
	 String cName;
	 long cmobile; // properties of contact
	 String email;

	public String getcName() {
		return cName; // setters and getters of contact
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getCmobile() {
		return cmobile;
	}

	public void setCmobile(long cmobile) {
		this.cmobile = cmobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printcontact() // method to display contact details
	{
		System.out.println(cName + "  " + cmobile + "  " + email);
	}

	public Contact() // default constructor
	{

	}

	public Contact(String cName, long cmobile, String email) {
		super();
		this.cName = cName; // contact constructor
		this.cmobile = cmobile;
		this.email = email;
	}

}

class CompanyContact extends Contact { // companycontact class extends the contact class
	String companyName;
	String cwebsite;
	String department; // properties of company contact
	String city;
	String country;
	String address;
	int pin;

	public CompanyContact() { // default constructor

	}

	public CompanyContact(String cName, long cmobile, String email, String companyName, String cwebsite,
			String department, String city, String country, String address, int pin) {
		super(cName, cmobile, email);
		this.companyName = companyName;
		this.cwebsite = cwebsite; // constructor
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
		this.pin = pin;
	}

	// @override
	public void printcontact() // overriden method
	{
		System.out.println(super.getcName() + "  " + super.getCmobile() + "  " + super.getEmail() + " " + companyName
				+ "  " + cwebsite + "  " + department + "  " + city + " " + country + " " + address + " " + pin);
	}
}

class EmployeeContact extends Contact { // employeecontact extended the contactclass
	String eCity;
	String ecountry; // properties of employeecontact
	int eCpin;
	String designation;
	String dob;

	public EmployeeContact() {

	}

	public EmployeeContact(String cName, long cmobile, String email, String eCity, String ecountry, int eCpin,
			String designation, String dob) {
		super(cName, cmobile, email);
		this.eCity = eCity; // constructor for employeecontact
		this.ecountry = ecountry;
		this.eCpin = eCpin;
		this.designation = designation;
		this.dob = dob;
	}

	// @override
	public void printcontact() // overriden method
	{
		System.out.println(super.getcName() + "  " + super.getCmobile() + "  " + super.getEmail() + " " + eCity + " "
				+ ecountry + " " + eCpin + " " + designation + " " + dob);

	}
}
