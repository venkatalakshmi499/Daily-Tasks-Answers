
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Account a=new Account();
		new Thread()
		{
			public void run()
			{
				a.withDraw(8000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				a.withDraw(9000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				a.deposit(10000);
			}
		}.start();
		
		
		

	}

}
