
public class Thread2 extends Thread {
     Thread1 t1=new Thread1();
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
	}
	
	public void dsplayAdd(int a,int b)
    {
    	System.out.println("Addition of Thread2 :"+(a+b));
    	
	try {
		Thread.sleep(3000);
		t1.join();
	}
	catch(InterruptedException ie)
	{
		ie.printStackTrace();
		}
    }
	

}
