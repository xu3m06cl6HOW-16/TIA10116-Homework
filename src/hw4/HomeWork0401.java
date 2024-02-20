package hw4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class HomeWork0401 {
	
	
	@Test//陣列元素平均值
	public void method00() {
		int[] ArrayNumber= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum=0;
		Arrays.sort(ArrayNumber);
		for(int i=0;i<ArrayNumber.length;i++) {
			sum+=ArrayNumber[i];
		}
		System.out.println("陣列平均值為:"+sum/ArrayNumber.length);
		System.out.println("比平均值大的值有:");
		for(int i=0;i<ArrayNumber.length;i++) {
			if(ArrayNumber[i]>sum/ArrayNumber.length) {
				System.out.print(ArrayNumber[i]+"\t");
			}
		}
	}
	
	@Test//字串反轉
	public void method01() {
		String str="Java script";
		String[]cup1=new String[str.length()];
		String[]cup2=new String[str.length()];
		int len=str.length();
		
		for(int i=0;i<cup1.length;i++) {
		cup1[i]=str.substring(i,i+1);
		--len;
		cup2[len]=cup1[i];
		}
		System.out.println("原本的字串為:"+str);
		System.out.print("反轉後的字串為:");
		for(int i=0;i<cup2.length;i++) {
			System.out.print(cup2[i]);
		}
	}	
		@Test//行星母音計算
	public void method02() {
			int sum=0;
			String[] planet= {"mercury","venus","earth","mars",
					"jupiter","saturn","uranus","neptune"};
			String[] cup= new String [planet.length];
			for(int i=0;i<planet.length;i++) {
				System.out.println(planet[i]);
				int k=0;
				for(int j=0;j<planet[i].length();j++) {
					cup[j]=planet[i].substring(k,++k);
					String t1=cup[j];
					if(t1.equals("a")||t1.equals("e")||t1.equals("i")||t1.equals("o")||t1.equals("u")) {
						sum+=1;
					}
				}
			}
			System.out.println("這行字串共有"+sum+"個母音!");
		}
	

}
