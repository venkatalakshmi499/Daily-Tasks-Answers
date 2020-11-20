package com.src;

class Exception1 extends Exception {
	public Exception1(String msg) { 
		super(msg); 
		System.out.println("String message");
	}
}

public class Task2 {
	public static void v() throws Exception1 {
		System.out.println("Throwing MyException from v()");
		throw new Exception1("From v()");
	}
	public static void main(String[] args) {
		try {
			v();
		} catch(Exception1 e) {
			System.err.println("Caught Exception1");
			e.printStackTrace();
		} finally {
			System.out.println("Made it to finally");
		}
		
	}	
}