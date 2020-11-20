package com.src;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("enter the value of b: ");
		int b=sc.nextInt();
		int c;
		
		try {
		c=a/b;
		System.out.println("The division of a/b is :"+c);
		
		}
		catch(ArithmeticException ae)
		{
			
			System.out.println("You are not done yet enter again:");
			
		}
		x++;
		}
		while(x==2);
		{
			System.out.println("You are done");
			
		}
		}
		
}
