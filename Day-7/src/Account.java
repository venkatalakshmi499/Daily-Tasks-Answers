
public class Account {
	int amount=15000;
	public synchronized void withDraw(int amount)
	{
		if(this.amount<amount)
		{
			System.out.println("Please wait for amount deposited");
			try {
			this.wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println("Amount is withDrawn");
		
	}
	public synchronized void deposit(int amount)
	{
		this.amount=this.amount+amount;
		this.notifyAll();
		System.out.println("Amount is deposited");
	}

}
