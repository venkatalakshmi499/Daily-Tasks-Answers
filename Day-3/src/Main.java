
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyContact cc = new CompanyContact(); // creation of object for companycontact
		cc.cName = "Venky";
		cc.cmobile = 123456; // assigning credentials
		cc.city = "Vizag";
		cc.address = "Vizianagaram";
		cc.companyName = "ABC";
		cc.country = "INDIA";
		cc.cwebsite = "www.something.com";
		cc.department = "ECE";
		cc.email = "abc@bbc.com";
		cc.pin = 56789;
		cc.printcontact();
		EmployeeContact ec = new EmployeeContact(); // creation of employee contact
		ec.eCpin = 9491;
		ec.eCity = "hyderabad"; // assigning credentials
		ec.ecountry = "INDIA";
		ec.designation = "Developer";
		ec.dob = "7/11/1998";
		ec.printcontact();

	}

}
