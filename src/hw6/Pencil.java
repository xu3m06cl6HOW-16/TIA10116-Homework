package hw6;

public class Pencil extends Pen{

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("削鉛筆再寫");
	}
	
	public Pencil() {}
	
	
	public Pencil(String brand,int price) {
		
//		super.setBrand(brand);
//		super.setPrice(price);
		super(brand,price);
	}
	
	public void getPencil() {
		String br=getBrand();
		int pr=getPrice();
		System.out.println("品牌為:"+br+",售價為:"+pr*0.8);
		
		
	}
	
		
	
}
