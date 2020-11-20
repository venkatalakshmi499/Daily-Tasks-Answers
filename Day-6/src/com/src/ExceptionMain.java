package com.src;
import java.util.Scanner;
public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Excercise5 q=new Excercise5();
		Scanner s=new Scanner(System.in);

		String a;
		System.out.println("enter a file name ");
		a=s.next();
		System.out.println("File existing or not");
		System.out.println(q.fileExists(a));

		System.out.println("enter a string");
		String s1;
		s1=s.next();
		System.out.println("whether given string is a number or not ");
		System.out.println(q.isInt(s1));
		System.out.println("whether given string is real number or not ");
		System.out.println(q.isDouble(s1));
		}

}






