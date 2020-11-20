import java.util.Scanner;
public class CaseStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("enter the value of b: ");
		int b=sc.nextInt();
		int c;
		//arithmetic operators
		c=a+b;
		System.out.println("Addition of a and b is :"+c);
		c=a-b;
		System.out.println("Substraction of a and b is: "+c);
		c=a/b;
		System.out.println("Division of a and b is:"+c);
		c=a%b;
		System.out.println("Reminder of a and b is:"+c);
		c=a*b;
		System.out.println("Multiplication of a and b is:"+c);
		//relational operators
		if(a>b)
		{
			System.out.println("a is greater value than b");
		}
		else if(a<b)
		{
			System.out.println("b is greater value than a");
		}
		else if(a==b)
		{
			System.out.println("Two numbers are equal");
		}
		//logical operator and relational
		else if((a%2==0) &&  (b%2==0)) {
		System.out.println("a and b are even numbers");
		}
		else if((a<=b)||(a>=b))
		{
			System.out.println("a*b");
		}
		System.out.println((a!=b)? true:false);
		c=a^b;
		System.out.println(c);
		
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(--b);
		System.out.println(a++);
		System.out.println(b--);
		b*=a;
		System.out.println(b);
		a/=b;
		System.out.println(a);
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(!(a==b));
		System.out.println();
		
		//bitwise operator
		
		c=a|b;
		System.out.println(c);
		c=a&b;
		System.out.println(c);
		
		System.out.println(a<<4);
		System.out.println(a>>2);
		System.out.println((a==b)? true :false);
		
		
				
	}

}
