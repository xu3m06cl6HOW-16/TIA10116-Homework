package hw7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caltest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		try {
			System.out.println("請輸入x的值");
			int x=sc.nextInt();
			System.out.println("請輸入y的值");
			int y=sc.nextInt();
			Calculator cl=new Calculator(x,y);
			int total=cl.printPow(x, y);
			System.out.println(total);
		}catch(CalException e) {
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
