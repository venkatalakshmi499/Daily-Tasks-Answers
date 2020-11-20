package com.src;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,8,9,6};
		try {
		System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace(System.out);
			System.out.println("We cannot access that element");
		}

	}

}
