
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1=new Thread1();
		Thread t2=new Thread2();
		t1.start();
		t1.setName("Venky");
		t2.start();
		t2.setName("Laxmi");
		t1.suspend();
		t1.resume();
		
		
		
		
	}

}
