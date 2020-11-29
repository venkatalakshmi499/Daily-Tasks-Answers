package com.src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int choice;
		System.out.println("enter your choice: ");
		 do { 
			 StudentSampleData.doList(); 
	    	choice=sc.nextInt();
	    
			 
		   switch(choice)
		    {
		    	case 1:
		    	{
		    		StudentSampleData.data();
		    		
		    	    System.out.println("values got inserted");
		    	
		    		   break;
		    	 }
		    	case 2:
		    		{
		    		System.out.println("Enter student id to remove: ");
		    		break;
		    	    }
		    }
		 }
		 while(choice!=1); 
		 
	}

	}


