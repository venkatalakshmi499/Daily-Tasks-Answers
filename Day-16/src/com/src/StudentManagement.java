package com.src;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
    do {
    	System.out.println("1.Insert Student");
    	System.out.println("2.Delete Student");
    	System.out.println("3.Update Student");
    	System.out.println("4.Display Student details");
    	System.out.println("5.Logout");
    	System.out.println("Enter your choice: ");
    	choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    	{
    		System.out.println("enter student details");
    		System.out.println("enter student id: ");
    		int sid=sc.nextInt();
    		System.out.println("enter student name:");
    		String sname=sc.next();
    		System.out.println("enter student address");
    		String sadd=sc.next();
    		System.out.println("enter student pwd: ");
    		String pwd=sc.next();
    		// int i= st.executeUpdate("insert into student values("+sid+ ",'"+sname+"','"+sadd+"','"+pwd+"')");
    		  // if(i>0)
    		  // {
    			   System.out.println("values got inserted");
    		 //  }
    		   break;
    	}
    	case 2:
    		{
    		System.out.println("Enter student id to remove: ");
    		//int sid=sc.nextInt();
    		break;
    	    }
    	}
    }
	}
	



