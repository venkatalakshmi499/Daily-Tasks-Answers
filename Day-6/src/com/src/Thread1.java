package com.src;

public class Thread1 extends Thread {
	public void run()
	{
	   for(int i=1;i<25;i++)
	   {
		   System.out.println("Thread1: "+i);
		  
	   }
	}

}
