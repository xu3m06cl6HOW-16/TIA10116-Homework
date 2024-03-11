package hw7_input_output;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class DogAndCatRemove implements Serializable{
	private static final long serialVersionUID = 1L;
	/*
	 * ObjectOutputStream要搭配FileOutputStream 小水管
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File output=new File("C:\\data");
		if(!output.exists()) {
			output.mkdirs();
		}
		
		File File = new File("C:\\data\\Object.ser");
		
		
		//輸出
		Object[] obj=new Object[4];
		obj[0]=new Dog("HUSKY");
		obj[1]=new Dog("Great Danes");
		obj[2]=new Cat("Garfield");
		obj[3]=new Cat("Maine Coon");
		
		FileOutputStream fw=new FileOutputStream(File);
		ObjectOutputStream oos=new ObjectOutputStream(fw);
		
		
		for(int i=0;i<obj.length;i++){
			oos.writeObject(obj[i]);
		}
		
		oos.close();
		fw.close();
		
		//輸入
		
		FileInputStream fr=new FileInputStream(File);
		ObjectInputStream ois = new ObjectInputStream(fr);
		
		System.out.println(File.getName() + "檔案內容如下: ");
		
		try {
			while (true) {
				Object obj1=ois.readObject();
				if(obj1 instanceof Dog) {
					((Dog)obj1).speak();	
				}
				if(obj1 instanceof Cat) {
					((Cat) obj1).speak();
					}
				System.out.println("\n");
			}
		} catch (EOFException e) {
			System.out.println("已讀取完畢");
		}
		
		
		
		ois.close();
		fr.close();
		
		
	}

}
