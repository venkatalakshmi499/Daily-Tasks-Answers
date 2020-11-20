package com.src;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception3 e3=new Exception3();
		e3=null;
		try {
		e3.add(6, 5);
		}
		catch(NullPointerException n)
		{
			n.printStackTrace(System.out);
		}
	}

}
class Exception3 {
 public void add(int a,int b)
{
	int sum=a+b;
	System.out.println(sum);
}
}