package com.src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		String str = "venk";
		int ar[] = { 12, 30, 98 };
		System.out.println(ar.length);
        
		try {
			c = a / b;
			System.out.println(ar[4]);
			System.out.println(c);
			System.out.println(str.charAt(6));
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			ae.getCause();
			ae.getStackTrace();
			System.out.println(ae.getLocalizedMessage());
		} 
		catch(ArrayIndexOutOfBoundsException aio)
		{
		aio.printStackTrace();
		}
		catch (Exception se) {
			se.printStackTrace();
			se.addSuppressed(se);
			System.out.println(se.getMessage());
			System.out.println("hello");
		} finally {
			System.out.println("ended");
		}
		System.out.println("hello");
		
		
	}
	
}

