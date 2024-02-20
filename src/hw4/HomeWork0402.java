package hw4;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0402 {
	
	@Test//我要借錢
	public void method00() {
		int money=0,sum=0;
		int[][] cls= {{25,32,8,19,27},{2500,800,500,1000,1200}};
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入想借的金額:");
		if(sc.hasNextInt()) {
			money=sc.nextInt();
		}
		System.out.println("可借錢員工編號:");
		for(int i=0;i<cls.length;i++) {
			for(int j=0;j<cls[i].length;j++) {
				if(cls[i][j]>=money) {
					++sum;
					System.out.print(cls[0][j]+" ");
				}
			}
		}
		System.out.printf("共%d人!",sum);
	}

}
