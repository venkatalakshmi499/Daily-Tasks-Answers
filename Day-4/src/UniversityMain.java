
public class UniversityMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 University u=new University();
		 System.out.println("University Name: "+u.universityName);
         System.out.println("No of Departments available are: "+University.noOfDepartments);
         u.universityCode();
         University.Electronics es=new University.Electronics();
         System.out.println("No of sections of ece dept are :"+es.noOfSections);
         System.out.println("No of faculty of ece dept are: "+es.noOfFaculty);
         es.display();
         University.Electronics.deptId();
         University.Cse uc=new University.Cse();
         System.out.println("No of setions of cse dept are :"+uc.noOfSections);
         System.out.println("No of faculty of cse dept are :"+uc.noOfFaculty);
         uc.display();
         University.Cse.deptId();
         University.Electrical ue=new University.Electrical();
         System.out.println("No of setions of electrical dept are :"+ue.noOfSections);
         System.out.println("No of faculty of electrical dept are :"+ue.noOfFaculty);
         ue.display();
         University.Electrical.deptId();
         University.Mechanical um=new University.Mechanical();
         System.out.println("No of setions of Mechanical dept are :"+um.noOfSections);
         System.out.println("No of faculty of Mechanical dept are :"+um.noOfFaculty);
         um.display();
         University.Mechanical.deptId();
         
         
       }

}
