package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public void method1() {
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("Praveen");
		arrayList.add("Saketh");
		arrayList.add("Priyanka");
		arrayList.add("Supriya");
		arrayList.add("Durga");
		arrayList.add("Sivakrishna");
		arrayList.add("Charan");
		
		System.out.println(arrayList);
		arrayList.add(2, "Jagadeesh");
		System.out.println(arrayList);
//		arrayList.clear();
//		System.out.println(arrayList);
		System.out.println(arrayList.get(5));
		System.out.println(arrayList.lastIndexOf("Saketh"));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.clone());
		arrayList.remove(4);
		System.out.println(arrayList);
		arrayList.remove("Durga");
		System.out.println(arrayList);
		arrayList.set(5, "W3Softech");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		System.out.println(arrayList);
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		Iterator<String> iterator=arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
	
	public static void main(String[] args) {
		ArrayList1 arrayList1=new ArrayList1();
		arrayList1.method1();
	}
}
