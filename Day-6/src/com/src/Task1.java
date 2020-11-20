package com.src;

public class Task1{
	public static void main(String args[])
	{
		try {
			throw new Exception("hii");
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught");
		}
		finally
		{
			System.out.println("I am there");
		}
	}
}