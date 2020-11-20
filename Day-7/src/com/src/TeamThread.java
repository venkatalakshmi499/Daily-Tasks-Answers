package com.src;

import java.util.Random;

public class TeamThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team t=new Team();
	new Thread()
	{
		public void run()
		{
			t.Race();
			System.out.println("Java Dalia @ Reached standpoint");
		}
			
	}.start();
	new Thread()
	{
		public void run()
		{
			t.Race();
			System.out.println("Velocity @ Reached standpoint");
		}
			
	}.start();
	new Thread()
	{
		public void run()
		{
			t.Race();
			System.out.println("  Data pirates @Reached standpoint");
		}
			
	}.start();
	new Thread()
	{
		public void run()
		{
			t.Race();
			System.out.println(" Teamquad @ Reached standpoint");
		}
			
	}.start();

}
	}