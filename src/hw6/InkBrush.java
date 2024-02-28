package hw6;

public class InkBrush extends Pen{
	
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public InkBrush(String brang,int price) {
		super(brang,price);
	}
	
	
	public void getInkBrush() {
		String br=getBrand();
		int pr=getPrice();
		System.out.println("品牌為:"+br+",售價為:"+pr*0.9);
	} 

}
