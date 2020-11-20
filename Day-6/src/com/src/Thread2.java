package com.src;

public class Thread2 extends Thread {

		public void run()
		{
		   for(int i=25;i<50;i++)
		   {
			   System.out.println("Thread2: "+i);
			   try {
				   Thread2.sleep(4000);
			   }
			   catch(InterruptedException ie)
			   {
				   ie.printStackTrace();
			   }
		   }
		}
	}
