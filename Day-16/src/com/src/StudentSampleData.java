package com.src;

import java.util.Scanner;

public class StudentSampleData {
	static int doList() {
		System.out.println("1.Insert Student");
    	System.out.println("2.Delete Student");
    	System.out.println("3.Update Student");
    	System.out.println("4.Display Student details");
    	System.out.println("5.Logout");
    	System.out.println("Enter your choice: ");
    	return doList();
	}
  static void data()
 {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter student details");
		System.out.println("enter student id: ");
		int sid=sc.nextInt();
		System.out.println("enter student name:");
		String sname=sc.next();
		System.out.println("enter student address");
		String sadd=sc.next();
		System.out.println("enter student pwd: ");
		String pwd=sc.next();
		 }
}
