package hw6;

public abstract class Pen {
	
	private String brand;
	private int price;
	
	public Pen() {}//空參數建構子
	
	
	public Pen(String brand,int price) {
		this.brand=brand;
		this.price=price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	abstract void write();
	
}
