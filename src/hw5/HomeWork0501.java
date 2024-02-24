package hw5;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0501 {
	
	@Test
	public void enterStarNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入方形的寬:");
		int width=sc.nextInt();
		System.out.println("請輸入方形的高");
		int height=sc.nextInt();

		starSqare(width, height);
	}
	
	
	public void starSqare(int width,int height) {
		for(int i=1;i<=height;i++) {
			for(int j=1;j<=width;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	//______________________________________________________________
	
	@Test
	public void randAvg() {
		int[] randomNumber=new int[10];
		int sum=0;
		for(int i=0;i<randomNumber.length;i++) {
			randomNumber[i]=(int)(Math.random()*101);
			System.out.print(randomNumber[i]+" ");
			sum+=randomNumber[i];
		}
		System.out.println("\n"+sum/randomNumber.length);
	}

}
