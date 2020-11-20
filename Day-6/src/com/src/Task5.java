package com.src;

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

public class Task5 {
	public static void g() throws MyException {
		System.out.println("Throwing MyException in g()");
		throw new MyException("Thrown from g()");
	}

	public static void f() throws MyException {
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}

}
