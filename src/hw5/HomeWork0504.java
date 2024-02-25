package hw5;

import org.junit.jupiter.api.Test;

public class HomeWork0504 {
	public void getAuthCode() {
		
		System.out.println("本次隨機產生驗證碼為:");
		for(int i=0;i<8;i++) {
			char a=(char)((Math.random()*58)+65);	
			while(a>90&&a<97) {
				a=(char)((Math.random()*58)+65);
			}
			int j=(int)(Math.random()*19);//1~18(9以下輸出,要數字出線機率變高降低)
			if(j<=9) {
				System.out.print(j);
			}else {
				System.out.print(a);
			}	
		}
	}
	
	@Test
	public void showVerification() {
		getAuthCode();		
	}
		
	
}