package hw7;

public class Calculator {
	
	private int x;
	private int y;
	
	public Calculator() {};
	
	public Calculator(int x,int y) {
		if(x==0&&y==0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y<0) {
			throw new CalException("次方為負數,結果回傳不為整數");
		}
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int printPow(int x,int y) {
		return (int)Math.pow(x, y);
	}

}
