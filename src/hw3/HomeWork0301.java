package hw3;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0301 {
	int n1,n2,n3;
	@Test
	public void method00() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("請輸入3個整數:");
		if(sc.hasNextInt()) 
			n1=sc.nextInt();
		if(sc.hasNextInt()) 
			n2=sc.nextInt();
		if(sc.hasNextInt()) {
			n3=sc.nextInt();
			triangle(n1, n2, n3);
		}
		
		else { 
			System.out.println("請重新輸入!");
		}
		
		
		
	}
	
	public void triangle(int n1,int n2,int n3) {
		if(n1==0||n2==0||n3==0) {
			System.out.println("不是三角形");
		}else if(n1==n2&&n1==n3) {
			System.out.println("為正三角形");
		}else if(n1==n2||n1==n3) {
			System.out.println("為等腰三角形");
		}else {
			System.out.println("為其它三角形");
		}
	}

}
