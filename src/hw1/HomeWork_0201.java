package hw1;

import org.junit.jupiter.api.Test;

public class HomeWork_0201 {
	
	@Test
	public void method01() {
		System.out.printf("12與6的和為: %d 積為:%d",12+6,12*6);
	}
	
	@Test
	public void method02() {
		int egg= 200;
		System.out.printf("200顆雞蛋共:%d打並%d顆",egg/12,egg%12);
	}
	
	@Test
	public void method03() {
		int second=256559,day=86400;//求小時		 	 //求分鐘				//求秒(分鐘,小時都不要
		System.out.printf(second+"秒為%d天,%d小時,%d分,%d秒",
				second/day,second%day/60/60,second%day/60%60,second%day%60%60);
	}
	
	@Test
	public void method04() {
		final float PI=3.1415F;
		final int RADIUS=5;
		System.out.printf("半徑為5的圓,圓面積為:%d,圓周長為:%d",(int)(PI*Math.pow(RADIUS,2)),(int)(RADIUS*2*PI));
	}
	
	@Test//本金x （1+利率）時間
	public void method05() {
		int money=10000;
		final float INTEREST=0.05F;
		
		System.out.printf("本金:"+money+"利率為"+INTEREST+"十年後本利和為:%d元",(int)(money*Math.pow((1+INTEREST),3)));
		
	}
	
	@Test
	public void method06() {
		System.out.println(5+5+"(純數字計算)");
		System.out.println(5+'5'+"(數字加字元,char自動轉UniCode)");
		System.out.println(5+"5"+"(純數字加字串)");
		
	}

}
