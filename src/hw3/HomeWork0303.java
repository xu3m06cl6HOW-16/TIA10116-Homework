package hw3;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0303 {
	
	
	@Test
	public void method00() {
		int a=0;
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
							System.out.print(choies[i][j]+" ");
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
	public void method01() {
		int a=0;
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
							System.out.print(choies[i][j]+" ");
							}
					}
					System.out.println();
				}
			}
		}else {
			System.out.println("請重新輸入!");
		}		
	}
}