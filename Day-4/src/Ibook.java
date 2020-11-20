
public interface Ibook{
	public int daysOverdue();
	public boolean isOverdue();
	public void computeFine();
}
class Book implements Ibook{
	String title;
	String author;
	int dayTaken;
	int dayReturn;
	double cost;
	int daysover;
	
	public Book(String title, String author, int dayTaken, int dayReturn, double cost, int daysover) {
		super();
		this.title = title;
		this.author = author;
		this.dayTaken = dayTaken;
		this.dayReturn = dayReturn;
		this.cost = cost;
		this.daysover = daysover;
	}
	public Book()
	{
		
	}

	public int daysOverdue()
	{
		daysover=dayReturn-dayTaken;
		return daysover;
	}
	
	public boolean isOverdue() {
		if(daysover>14)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void computeFine()
	{
		int dayscrossed;
		dayscrossed=daysover-14;
		double fine;
		if(dayscrossed<=0)
		{
			System.out.println("No fine for book");
		}
		else
		{
			fine=dayscrossed*(0.1)*cost;
			System.out.println(" fine for the book is "+fine);
		}
		
	}
}
class RefBook implements Ibook{
	String title;
	int dayTaken;
	int dayReturn;
	double cost;
	int daysover;
	
	public RefBook(String title, int dayTaken, int dayReturn, double cost, int daysover) {
		super();
		this.title = title;
		this.dayTaken = dayTaken;
		this.dayReturn = dayReturn;
		this.cost = cost;
		this.daysover = daysover;
	}
	public RefBook()
	{
		
	}
	public int daysOverdue()
	{
		daysover=dayReturn-dayTaken;
		return daysover;
	}
	public boolean isOverdue() {
		if(daysover>2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public void computeFine() {
		int dayscrossed;
		dayscrossed=daysover-2;
		double fine;
		if(dayscrossed<=0)
		{
			System.out.println("No fine for reference book");
		}
		else
		{
			fine=dayscrossed*(0.1)*cost;
			System.out.println(" fine for the reference book is "+fine);
		}
		
	}
	
}
class AudioBook implements Ibook{
	String title;
	String author;
	int dayTaken;
	int dayReturn;
	double cost;
	int daysover;
	
	public AudioBook(String title, String author, int dayTaken, int dayReturn, double cost, int daysover) {
		super();
		this.title = title;
		this.author = author;
		this.dayTaken = dayTaken;
		this.dayReturn = dayReturn;
		this.cost = cost;
		this.daysover = daysover;
	}
	public AudioBook()
	{
		
	}
	public int daysOverdue()
	{
		daysover=dayReturn-dayTaken;
		return daysover;
	}
	public boolean isOverdue()
	{
		if(daysover>14)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void computeFine() {
		int dayscrossed;
		dayscrossed=daysover-14;
		double fine;
		if(dayscrossed>=1)
		{
			fine=dayscrossed*(0.2)*cost;
			System.out.println(" fine for the Audio book is "+fine);
			
		}
		else
		{
			System.out.println("No fine for Audio book");
			
		}
		
	}
}
