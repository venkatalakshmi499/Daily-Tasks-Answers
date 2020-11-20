package com.src;


class MyException2 extends Exception{
	private int x;
	public MyException2(String msg)
	{
		super(msg);
	}
	public MyException2(String msg,int x)
	{
		super(msg);
		this.x=x;
	}
	public int value()
	{
		return x;
	}
	public String getMessage()
	{
		return "Detail Message: "+ x + " "+ super.getMessage(); 
	}
	
	public MyException2()
	{
		
	}
}

public class Task3 {
  public static void f()throws MyException2
  {
	  System.out.println("Throwing Myexception from f()method");
	  throw new MyException2();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		}
		catch(MyException2 m)
		{
			m.printStackTrace(System.out);
		}

	}

}
