package hw7_input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomOutput {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("src\\hw7_input_output\\Random.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		
		
		
		for(int i=1;i<=10;i++) {
			pw.print((int)(Math.random()*1000+1)+"\n");	
		
			pw.flush();
		}
		
		pw.close();
		bw.close();
		fw.close();
		
		
		
	}

}
