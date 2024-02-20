package hw4;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class HomeWork0404 {
	
	@Test
	public void method00() {
		int inx=0;
		int one=0;
		int two=0;
		int thr=0;
		int fou=0;
		int fiv=0;
		int six=0;
		int sev=0;
		int eig=0;
		int[][] fraction= {{1,2,3,4,5,6,7,8},
						   {10,35,40,100,90,85,75,70},
						   {37,75,77,89,64,75,70,95},
						   {100,70,79,90,75,70,79,90},
						   {77,95,70,89,60,75,85,89},
						   {98,70,89,90,75,90,89,90},
						   {90,80,100,75,50,20,99,75}
		};
		for(int i=1;i<fraction.length;i++) {
			int top=0;
			for(int j=0;j<fraction[i].length;j++) {				
				if(fraction[i][j]>top) {
					top=fraction[i][j];
					inx=j;
				}
			}switch (inx+1) {
				case 1: {
				one++;
				break;
					}
				case 2: {
					two++;
					break;
						}
				case 3: {
					thr++;
					break;
						}
				case 4: {
					fou++;
					break;
						}
				case 5: {
					fiv++;
					break;
						}
				case 6: {
					six++;
					break;
						}
				case 7: {
					sev++;
					break;
						}
				case 8: {
					eig++;
					break;
						}
				}
		}
		System.out.printf("1號同學:%d次 2號同學:%d次 3號同學:%d次 4號同學:%d次 5號同學:%d次 6號同學:%d次 7號同學:%d次 8號同學:%d次\n",
				one,two,thr,fou,fiv,six,sev,eig);
	}
}
