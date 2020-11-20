import java.util.Scanner;
public class CaseStudy3 {
     static int a;//static variable
     int b;//non static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b values:");
		CaseStudy3 cs=new CaseStudy3();
		cs.a=sc.nextInt();
		cs.b=sc.nextInt();
		int result;
		result=cs.a+cs.b;
		System.out.println("Addition of a and b is:"+result);
		result=cs.a-cs.b;
		System.out.println("Substarction of a and b is:"+result);
		result=cs.a*cs.b;
		System.out.println("Multiplication :"+result);
		result=cs.a/cs.b;
		System.out.println("Division:"+result);
		result=cs.a%cs.b;
		System.out.println("Modular division "+result);
		
		
		
		
		

	}

}
