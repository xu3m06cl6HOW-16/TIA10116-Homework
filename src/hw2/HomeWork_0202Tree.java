package hw2;

import org.junit.jupiter.api.Test;

public class HomeWork_0202Tree {

	@Test
	public void method01() {
		int sum=0;
		for(int i=1;i<=49;i++) {
			if(i%4!=0)
				if(i<40) {
					sum+=1;
				System.out.println(i);}
			}
		System.out.printf("共有%d個數字可以選擇",sum);
	}
	
	@Test
	public void method02() {
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	@Test
	public void method03() {
	
		for(int i=1;i<=6;i++) {		
			for(int j=1;j<=i;j++) {	
				String x;
				switch (i) {
				case 1:
					x="A";
				System.out.print(x);
				break;
				case 2:
					x="B";
					System.out.print(x);
					break;
				case 3:
					x="C";
					System.out.print(x);
					break;
				case 4:
					x="D";
					System.out.print(x);
					break;
				case 5:
					x="E";
					System.out.print(x);
					break;
				case 6:
					x="F";
					System.out.print(x);
					break;
				}
				
			}
			System.out.println();
		}
	}
}
