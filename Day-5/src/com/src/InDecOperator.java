package com.src;

public class InDecOperator{
	

	    public void add2(int a,int b)
		{
			a+=b;
			System.out.println("Addition of a and b is :"+(a));
		}
		public void postInc(int b)
		{
			b=b++;
			System.out.println("increment of b:"+b);
		}
		public void postDec(int b)
		{
			System.out.println("decrement of b is:"+(b--));
		}
		public void div2(int a,int b)
		{
			a/=b;
		System.out.println("Division of a and b is:"+a);
		}
	    public void rem(int a,int b)
	    {
	    	a%=b;
	    	System.out.println("Reminder of a and b is:"+a);
	    }
	    public void assign(int a,int b)
	    {
	    	a=b;
			System.out.println("assignment of a and b is:"+a);
	    }


	}
