interface Greetings {
	public abstract void morining();
	public abstract void afternoon();
	public abstract void evening();
	public abstract void night();

}
class English implements Greetings{
	public void morining()
	{
		System.out.println("Good morning!");
	}
	public void afternoon()
	{
		System.out.println("Good afternoon!");
	}
	public void evening()
	{
		System.out.println("Good evening!");
	}
	public void night()
	{
		System.out.println("Good night!");
	}

}
class Hindi implements Greetings{
	public void morining()
	{
		System.out.println("subhodaya!");
	}
	public void afternoon()
	{
		System.out.println("subdopahar!");
	}
	public void evening()
	{
		System.out.println("subhsadya!");
	}
	public void night()
	{
		System.out.println("subratri!");
	}
	
}
class Telugu implements Greetings{
	public void morining()
	{
		System.out.println("subhaudayam!");
	}
	public void afternoon()
	{
		System.out.println("subhamadyahnam!");
	}
	public void evening()
	{
		System.out.println("subhasayantram!");
	}
	public void night()
	{
		System.out.println("subharatri!");
	}
	
}
