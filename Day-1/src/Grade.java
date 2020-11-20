import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks1: ");
		int m1=sc.nextInt();
		System.out.println("enter marks2:");
		int m2=sc.nextInt();
		System.out.println("enter marks3:");
		int m3=sc.nextInt();
		char grade;
		double percentage=(m1+m2+m3)/3;
		if(percentage>=75 && percentage <=100)
		{
           grade='A';
		}
		else if(percentage<75 && percentage >=65)
		{
			grade='B';
		}
		else if(percentage<65 && percentage>=45)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		switch(grade)
		{
		case 'A':System.out.println("First class");
		break;
		case 'B':System.out.println("Second class");
		break;
		case 'C':System.out.println("Third class");
		break;
		case 'D':System.out.println("Fail");
		break;
		default:
			System.out.println("INVALID");
			break;
		
			
		}
		
		
		
		
	

	}

}
