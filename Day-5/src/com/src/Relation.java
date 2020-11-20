package com.src;

public class Relation {

	
		public void greater(int a,int b)
		{
		    System.out.println((a>b)?true:false);
		}
		public void lessthan(int a,int b)
		{
			System.out.println((a<b)? true:false);
		}
		public void equal(int a,int b) {
			System.out.println((a==b)? true:false);
		}
		public void greaterThanEqual(int a,int b)
		{
			System.out.println(" a is greater than equal to b :"+(a>=b));
		}
		public void lessThanEqual(int a,int b)
		{
			System.out.println(" a is less than equal to b :"+(a<=b));
		}
		public void notEqual(int a,int b)
		{
			System.out.println(" a is not equal to b :"+(a!=b));
		}
			
	}
