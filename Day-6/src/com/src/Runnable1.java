package com.src;

public class Runnable1 implements Runnable{
	public void run()
	{
	   for(int i=51;i<75;i++)
	   {
		   System.out.println("Thread3: "+i);
		   try {
			   Thread.sleep(4000);
		   }
		   catch(InterruptedException ie)
		   {
			   ie.printStackTrace();
		   }
	   }
	}

}

class Runnable2 implements Runnable{
	public void run()
	{
	   for(int i=76;i<100;i++)
	   {
		   System.out.println("Thread4: "+i);
		   try {
			   Thread2.sleep(1000);
		   }
		   catch(InterruptedException ie)
		   {
			   ie.printStackTrace();
		   }
	   }
	}
}