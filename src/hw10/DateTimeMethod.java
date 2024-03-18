package hw10;

import java.util.Scanner;

public class DateTimeMethod {
	
	public static void main(String []args) {
		
		String dat = "^\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])$";

		Scanner sc =new Scanner(System.in);
		System.out.println("請輸入日期(年月日，例20110131):");
		String inDat=sc.next();
		if(inDat.matches(dat)) {
			
			String yyyy=inDat.substring(0, 4);
			String mm=inDat.substring(4, 6);
			String dd=inDat.substring(6,8);
			
			System.out.println("欲格式化成:(1)年/月/日(2)月/日/年(3)日/月/年:");
			int confirm = sc.nextInt();
			switch (confirm) {
			case 1: {
				System.out.println(yyyy+"/"+mm+"/"+dd);
				break;
			}
			case 2:{
				System.out.println(mm+"/"+yyyy+"/"+dd);
				break;
			}
			case 3:{
				System.out.println(dd+"/"+mm+"/"+yyyy);
				break;
			}
			} 
		
//		int y=Integer.parseInt(yyyy);
//		int m=Integer.parseInt(mm);
//		int d=Integer.parseInt(dd);
		
//		GregorianCalendar tt=new GregorianCalendar(y,m,d);

//		int y1=tt.get(Calendar.YEAR);
//		int m1=tt.get(Calendar.MONTH);
//		int d1=tt.get(Calendar.DATE);
		
		}else {
			System.err.println("日期格式不正確,請再輸入一次!");
		}
	}

}
