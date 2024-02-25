package hw5;


public class MyRectangel {
	double width,depth;
	
	public MyRectangel() {
	}
	
	public MyRectangel(double width,double depth) {
		this.width=width;
		this.depth=depth;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width*depth;
	}
	
	

}
