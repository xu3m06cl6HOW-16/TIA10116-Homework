package hw7_input_output;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyFile {
	
	public static void main(String[] args) throws IOException {
		
		File input=new File("src\\hw7_input_output\\Random.txt");
		File output=new File("src\\hw7_input_output\\CopyRandom.txt");
		
		CopyFile cf=new CopyFile();
		cf.copyFile(input, output);
		
		
	}
	
	
	public void copyFile(File input,File output) throws IOException {
		
		
		FileReader fi=new FileReader(input);
		FileWriter fp=new FileWriter(output);
		int c;
		while((c=fi.read())!=-1) {
			fp.write(c);
			fp.flush();
		}
		
		fp.close();
		fi.close();
	}

}
