
public abstract class Abook implements Ibook {
	public static void main(String args[])
	{
		Book b = new Book();
		System.out.println(b.author = "mike");
		System.out.println(b.dayTaken = 5);
		System.out.println(b.dayReturn = 30);
		System.out.println(b.cost = 500);
		System.out.println(b.daysOverdue());
		System.out.println(b.isOverdue());
		b.computeFine();
		RefBook rb = new RefBook();
		System.out.println(rb.title = "something");
		System.out.println(rb.dayTaken = 10);
		System.out.println(rb.dayReturn = 24);
		System.out.println(rb.cost = 700);
		System.out.println(rb.daysOverdue());
		System.out.println(rb.isOverdue());
		rb.computeFine();
		AudioBook ab = new AudioBook();
		System.out.println(ab.title = "nothing");
		System.out.println(ab.dayTaken = 15);
		System.out.println(ab.dayReturn = 20);
		System.out.println(ab.cost = 900);
		System.out.println(rb.daysOverdue());
		System.out.println(rb.isOverdue());
		rb.computeFine();
	}
	

	
}
