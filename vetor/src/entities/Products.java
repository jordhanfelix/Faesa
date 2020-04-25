package entities;

public class Products {

	private String name;
	private double price;

	// constructors
	public Products() {

	}

	public Products(String name, double price) {
		
		this.setName(name);
		this.setPrice(price);
	}

	// get and set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
