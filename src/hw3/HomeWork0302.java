package hw3;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0302 {
	
	int num;
	@Test// 0~9猜亂數
	public void method00() {
		
		int number=(int)(Math.random()*10);
		Scanner sc=new Scanner(System.in);
		
			do {
				System.out.println("請輸入一個0~9的整數");
				if(sc.hasNextInt()) {
					num=sc.nextInt();
					if(num==number) {
						break;
					}
					System.out.println("猜錯囉!");
				}			
			} while (num!=number);
			System.out.println("答對了!答案就是"+number);
		}
	
	
	@Test //Pro
	public void method01() {
		
		int number=(int)(Math.random()*101);
		
		for(int i=0;i<2;i++) {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入一個0~100的整數");
			i+=3;
			while(sc.hasNextInt()){

					num=sc.nextInt();
	
					if(num>number) {
						System.out.println("猜錯囉!再猜小一點");
					}else if(num<number) {
						System.out.println("猜錯囉!再猜大一點");
					}
					else{
						System.out.println("答對了!答案就是"+number);
						
					}
					
			}
			i=0;
	}
}
}	