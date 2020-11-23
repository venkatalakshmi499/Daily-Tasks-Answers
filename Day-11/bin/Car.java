import com.lamba.Car;

class Car {
	private String carname;
	
	private int price;
	
	public String getCarname() { return this.carname; }
	
	public void setCarname(String carname) { this.carname = carname; }
	
	public int getPrice() { return this.price; }
	
	public void setPrice(int price) { this.price = price; }
	
	public String toString() { return "Car [carname=" + this.carname + ", price=" + this.price + "]"; }
}
