package com.src;
import java.util.Scanner;
      public class Arithmetic {
	
		public void add(int a,int b) {
			System.out.println("Enter a and b values: ");
			Scanner s=new Scanner(System.in);
		     a = s.nextInt();
			 b = s.nextInt();

			System.out.println("Addition of a and b is :" + (a + b));
		}
		public void sub(int a,int b)
		{
			System.out.println("subtraction of a and b is :" + (a - b));
		}
		
		public void mul(int a,int b) {
			
			System.out.println("Multiplication of a and b is:" + (a * b));
		}
		
		public void div(int a,int b) {
			System.out.println("Division of a and b is:" + (a / b));
		}
		

		}
