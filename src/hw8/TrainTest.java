package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
 * 1.不重覆要覆寫HashCode與Equals
 * 2.TreeSet自訂物件要實作Comparable介面 才會過濾重覆
 */
public class TrainTest {

	public static void main(String[] args) {
		
		
		Set<Train> set=new TreeSet<Train>();
		
		set.add(new Train(202,"普悠瑪","樹林","花蓮", 400));
		set.add(new Train(1254,"區間","屏東","基隆", 700));
		set.add(new Train(118, "自強","高雄","台北", 500));
		set.add(new Train(1288,"區間","新竹","基隆", 400));
		set.add(new Train(122,"自強","台中","花蓮", 600));
		set.add(new Train(1222,"區間","樹林","七堵", 300));
		set.add(new Train(1254,"區間","屏東","基隆", 700));
		
		//Iterator
		System.out.println("_________________________以下為Iterator迭代器取得________________________");
		Iterator<Train> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//For...Each
		System.out.println("__________________________以下為For.....Each取得_______________________");
		for(Train a:set) {
			System.out.println(a);
		}
		
	}
	
	
	
}
