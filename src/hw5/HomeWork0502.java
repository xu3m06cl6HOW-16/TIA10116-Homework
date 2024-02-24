package hw5;

import org.junit.jupiter.api.Test;

public class HomeWork0502 {
	
	public int maxElement(int x[][]) {
		
		int maxInt=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>maxInt)
					maxInt=x[i][j];
				}
			}
		return maxInt;
		}
	
	public double maxElement(double x[][]) {
		
		double maxdou=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>maxdou)
					maxdou=x[i][j];
				}
			}
		return maxdou;
		
	}
	
	@Test
	public void method00() {
		HomeWork0502 w=new HomeWork0502();
		
		int[][] intArray= {{1,6,3},{9,5,2}};
		double[][] doubleArray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	} 

}
