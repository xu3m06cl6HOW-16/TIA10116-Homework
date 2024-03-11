package hw8;

import java.util.Objects;

public class Train implements Comparable<Train>{
	
	private int number;
	private String type;
	private String star;
	private String dest;
	private double price;
	
	
	public Train() {}
	
	public Train(int number,String type,String star,String dest,double price) {
		this.number=number;
		this.type=type;
		this.star=star;
		this.dest=dest;
		this.price=price;
	}
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", star=" + star + ", dest=" + dest + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, star, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(star, other.star) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Train o) {
		if(this.number>o.number) {
			return 1;
		}else if(this.number==o.number) {
			return 0;
		}else 
			return -1;
		
	}
	
	

}
