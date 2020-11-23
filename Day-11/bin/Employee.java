import com.lamba.Employee;

class Employee {
	private String empname;
	
	private int salary;
	
	public String getEmpname() { return this.empname; }
	
	public void setEmpname(String empname) { this.empname = empname; }
	
	public int getSalary() { return this.salary; }
	
	public void setSalary(int salary) { this.salary = salary; }
	
	public String toString() { return "Employee [empname=" + this.empname + ", salary=" + this.salary + "]"; }
}
