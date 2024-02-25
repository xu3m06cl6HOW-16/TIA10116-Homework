package hw5;

public class MyRectangelMain {

	public static void main(String[] args) {
		MyRectangel mr=new MyRectangel();
		mr.setWidth(10);
		mr.setDepth(20);
		
		System.out.println(mr.getArea());
		
		MyRectangel mr1=new MyRectangel(10, 20);
		System.out.println(mr1.getArea());
		
		

	}

}
