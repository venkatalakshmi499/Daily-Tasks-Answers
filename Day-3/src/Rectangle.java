
public class Rectangle { // rectangle class parent
	int length;
	int width;

	public Rectangle(int length, int width) { // constructor
		super();
		this.length = length; // using this initializing variables
		this.width = width;
	}

	public Rectangle() // default constructor
	{

	}

	public void calculateArea() // method to print area
	{
		System.out.println("Area of rectangle is : " + length * width); // area of rectangle
	}

}

class Box extends Rectangle { // box class extends rectangle class
	int depth;

	public Box(int length, int width, int depth) { // constructor of box class
		super(length, width);
		this.depth = depth;
	}

	public Box() // default constructor
	{

	}

	// @override
	public void calculateArea() // overriden method
	{
		System.out.println("Volume of box is : " + length * width * depth);
	}

}
