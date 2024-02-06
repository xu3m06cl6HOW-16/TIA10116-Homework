package hw1;

import org.junit.jupiter.api.Test;

public class HomeWork_9x9 {

	@Test//9*9乘法表
	public void method00() {
		int j,k;
		
		for(j=1;j<=9;j++) {
			for(k=1;k<=9;k++) {
				System.out.print(j+"*"+k+"="+j*k+"\t");
			}
			System.out.println();
		}
	}
	
	
	@Test//for+while
	public void method01() {
		int j;
		for(int i=1;i<=9;i++){
			j=1;
			while(j<=9) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
				}
			System.out.println();
			}
	}
	
	@Test//for+do while
	public void method02() {
		for(int i=1;i<=9;i++) {
			int j=1;
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);
			System.out.println();
		}
	}
	
	@Test//while+do while
	public void method03() {
		int i=1,j=1;
		while(i<=9) {
			do {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				j++;
			}while(j<=9);{
				System.out.println();
				i++;
				j=1;
			}	
		}
	}
}
