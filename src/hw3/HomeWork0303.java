package hw3;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0303 {
	
	
	@Test
	public void method00() {
		int a=0;
		int[] num=new int[1];
		int[][] choies=new int[7][7];
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入你討厭的數字(1~9)");
		if(sc.hasNextInt()) {
			 num[0]=sc.nextInt();
			if(num[0]>9||num[0]<1) {
				System.out.println("請重新輸入!");
			}
			else {
				System.out.println("你可以選的數字有:");
				for(int i=0;i<choies.length;i++) {
					for(int j=0;j<choies[i].length;j++) {
						choies[i][j]=++a;
						if(a!=num[0]) {
							System.out.print(a+" ");
							}
						
					}
					System.out.println("");
				}
				System.out.println("共有"+(a-num.length)+"個號碼可以選");
			}
		}else {
			System.out.println("請重新輸入!");
		}		
	}
	
	
	@Test//pro 選完產生六個不重複 //!未完成!
	public void method01() {
		int a=0;
		int[] random=new int[6];
		
		
		int[][] choies=new int[7][7];
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入你討厭的數字(1~9)");
		if(sc.hasNextInt()) {
			int num=sc.nextInt();
			if(num>9||num<1) {
				System.out.println("請重新輸入!");
			}
			else {
				System.out.println("你可以選的數字有:");
				for(int i=0;i<choies.length;i++) {
					for(int j=0;j<choies[i].length;j++) {
						choies[i][j]=++a;
						if(a!=num) {
							System.out.print(a+" ");
						}
					}
					System.out.println();
				}
			}
		}else {
			System.out.println("請重新輸入!");
		}
	}
	
	@Test
	public void test01() {
		int a;
		int b;
		int c;
		int d;
		do {
			 a=(int)(Math.random()*4);
			 b=(int)(Math.random()*4);
			 c=(int)(Math.random()*4);
			 d=(int)(Math.random()*4);
		}while(a!=b&&b!=c&&a!=c);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	@Test
	public void test02() {
		
	int a,b,c;
	do{
		a=(int)(Math.random()*3);
		b=(int)(Math.random()*3);
		c=(int)(Math.random()*3);
		}while(a==b||a==c||b==c);
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
}
