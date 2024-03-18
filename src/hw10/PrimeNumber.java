package hw10;

public class PrimeNumber {
	
	//亂數判斷是否為質數
	public static void main(String[] args) {
		int j=0;
		int rand=(int)((Math.random()*100)+1);
		for(int i=2;i<rand;i++) {
			if(rand%i==0) {
				j++;
			}
		}
		if(j==0) {
			System.out.println(rand+"是質數");
		}else
		System.out.println(rand+"不是質數");
	}

}
