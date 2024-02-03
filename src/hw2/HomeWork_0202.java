package hw2;

import org.junit.jupiter.api.Test;

public class HomeWork_0202 {
	
	@Test
	public void method01() {
		int sum=0;
		for(int i=0;i<=1000;i++) {
			if(i%2==0)
			sum+=i;
		}
		System.out.printf("1~1000的偶數和為:%d",sum);
	}
	
	@Test
	public void method02() {
		int sum=1;
		for(int i=1;i<=10;i++) {
			sum*=i;
		}
		System.out.printf("1~10的連乘積為:%d",sum);
	}
	
	@Test
	public void method03() {
		int i=1,sum=1;
		while(i<=10) {
			sum*=i;
			i++;
		}
		System.out.printf("1~10的連乘積為:%d",sum);
	}
	
	@Test
	public void method04() {
		for(int j=0;j<100;) {		
			for(int i=1;i<20;++i) {
				if(i%2!=0) {
					j+=i;			
					System.out.println(j);		
				}
			}
		}
	}

}