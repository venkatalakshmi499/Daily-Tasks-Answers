package com.src;

public class ThreadMain extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread1 t1=new Thread1();
     Thread2 t2=new Thread2();
     Runnable1 r1=new Runnable1();
     Thread t3=new Thread(r1);
     Runnable2 r2=new Runnable2();
     Thread t4=new Thread(r2);
     t1.start();
     t2.start();
     t3.start();
     t4.start();
     
     
	}

}
