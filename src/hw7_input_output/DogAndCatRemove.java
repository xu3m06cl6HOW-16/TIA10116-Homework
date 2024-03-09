package hw7_input_output;

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
		String filePath = "C:\\data\\Object.ser";
		File newFile = new File(filePath);
		if (newFile.createNewFile()) {
            System.out.println("文件创建成功");
        } 
		
		//輸出
		Object[] obj=new Object[4];
		obj[0]=new Dog("HUSKY");
		obj[1]=new Dog("Great Danes");
		obj[2]=new Cat("Garfield");
		obj[3]=new Cat("Maine Coon");
		
		FileOutputStream fw=new FileOutputStream(filePath);
		ObjectOutputStream oos=new ObjectOutputStream(fw);
		
		
		for(int i=0;i<obj.length;i++){
			oos.writeObject(obj[i]);
		}
		
		oos.close();
		fw.close();
		
		//輸入
		
		FileInputStream fr=new FileInputStream(filePath);
		ObjectInputStream ois = new ObjectInputStream(fr);
		
		System.out.println(output.getName() + "檔案內容如下: ");
		System.out.println("____________________________________________________");
		
		try {
			while (true) {
				((Dog) ois.readObject()).speak();/*讀取檔案*/
			  //readObject是Object類型 要轉Dog才能呼叫speak方法
				System.out.println("--------------------");
			}
		} catch (ClassCastException e) {
			((Cat) ois.readObject()).speak();
		}finally {
			((Cat) ois.readObject()).speak();
		}
		
		
		
		
		ois.close();
		fr.close();
		
		
	}

}
