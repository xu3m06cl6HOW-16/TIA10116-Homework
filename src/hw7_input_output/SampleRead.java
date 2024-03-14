package hw7_input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleRead {
	
	public static void main(String[] args) throws IOException {

		int sum=0,k=0;
		String str;
		File dir=new File("src\\hw7_input_output\\Sample.txt");
		FileReader fr=new FileReader(dir);
		BufferedReader br=new BufferedReader(fr);
		
		
		while((str=br.readLine())!=null){ 
			
				sum += str.length();
			k+=1;
			System.out.println(str);
			}
		
		System.out.println("\n"+dir.length()+"個位元組");
		System.out.println(sum+"個字元");
		System.out.println(k+"列資料");
		;

		br.close();
		fr.close();
			
	}
}
