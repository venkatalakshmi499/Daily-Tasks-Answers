package com.src;

class MyException1 extends Exception{
	String msg1;

	public MyException1(String msg1) {
		this.msg1 = msg1;
	}
	
}
class MyException2 extends Exception{
	String msg2;

	public MyException2(String msg2) {
		this.msg2=msg2;
	}
	
}
class MyException3 extends Exception{
	String msg3;
	
}

public class Task7 {
	public void h()
	{
		System.out.println("this is meathod ");
	}
	public static void main(String[] args) throws MyException1, MyException3, MyException2 {
		// TODO Auto-generated method stub
		Task7 t=new Task7();
		t.h();
		}
		

	}
