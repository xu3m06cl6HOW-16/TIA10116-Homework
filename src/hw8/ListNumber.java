package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListNumber {
	
	public static void main(String[] args) {
		
		List<Object> list=new ArrayList<>();
		list.add((Integer)100);
		list.add((Double)3.14);
		list.add((Long)21L);
		list.add((short)100);
		list.add((Double)5.1);
		list.add("Kitty");
		list.add((Integer)100);
		list.add((Object)"Snoopy");
		list.add(new BigInteger("1000"));
		
		//Iterator
		Iterator<Object> it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		System.out.println();
		//For
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		//For...each
		for(Object obj:list) {
			System.out.print(obj+"\t");
		}
		System.out.println("\nNumber以外已移出:");
		

		Iterator<Object> in=list.iterator();
		while(in.hasNext()) {
			Object obj=in.next();
			if(obj instanceof Number) {
				System.out.print(obj+"\t");
			}
		}
		
	}

}
