import java.util.*;
public class CaseStudy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int num=sc.nextInt();
		int count=0;
		int sum=0,rem,rev=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		if(count==3)
		{
			int lastdigit=num%10;
			if(lastdigit%2==0)
			{
			  while(num!=0)
			  {
				  lastdigit=num%10;
				  sum=sum+lastdigit;
				  num=num/10;
				  System.out.println("sum of the digits of a number is:"+sum);
			  }
			 
			}
			else
			{
				 while(num!=0)
				  {
					  lastdigit=num%10;
					  rev=rev*10+lastdigit;
					  num=num/10;
				  }
				 System.out.println("Reverse of a number is "+rev);
			}
		}
		
		

	}

}
