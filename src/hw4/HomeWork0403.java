package hw4;


import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0403 {
	@Test
	public void method00() {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入要計算的西元年、月、日");
			int year=sc.nextInt();
			int mon=sc.nextInt();
			int day=sc.nextInt();
			int total=0;
			
			if(year%4!=0) {
				if(mon==2&&day>28) {
					System.out.println("今年2月只有28天,請重新輸入!");
				}else {
					int[][] sum=new int[mon][];
					for(int i=1;i<sum.length;i++) {
						if(i<8) {
						if(i%2==0) {
							if(i==2) {
								total+=28;
							}else {
							total+=30;
							}
							}
						else
							total+=31;
						}if(i>=8) {
						if(i%2==0) 
							total+=31;
						else
							total+=30;
					}
			
			}
					System.out.printf("輸入的日期為該年第%d天",(total+day));
		}
					
				}else if(year%4==0) {
					int[][] sum=new int[mon][];
					for(int i=1;i<sum.length;i++) {
						if(i<8) {
							
						if(i%2==0) { 
							if(i==2) {
								total+=29;
							}else{
							total+=30;
							}
						}
						else
							total+=31;
						}if(i>=8) {
						if(i%2==0) 
							total+=31;
						else
							total+=30;
					}
			}
					System.out.printf("輸入的日期為該年第%d天",(total+day));
				}
			}
	}