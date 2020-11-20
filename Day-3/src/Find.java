import java.util.*;
public class Find {
	int a, b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public Find(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Find()
	{
		
	}
	
}
class Derived extends Find{

	public Derived(int a, int b, int a2, int b2) {
		super(a, b);
		a = a2;
		b = b2;
	}
	public Derived()
	{
		
	}

	public void dispMax() {
		{
			System.out.println("Maximum number is :"+ Math.max(a,b));
		}

	}

	public void dispMin() {
		
		{
			System.out.println("Minimum number is :"+Math.min(a, b));
		}

	}
}
