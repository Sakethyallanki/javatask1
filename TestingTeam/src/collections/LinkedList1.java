package collections;

import java.util.LinkedList;

public class LinkedList1 {
	
	public void method1() {
		LinkedList<Integer> linkedList=new LinkedList<>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(50);
		linkedList.add(60);
		
		System.out.println(linkedList);
		linkedList.add(6, 70);
		System.out.println(linkedList);
		linkedList.addFirst(0);
		linkedList.addLast(80);
		System.out.println(linkedList);
		System.out.println(linkedList.contains(10));
		System.out.println(linkedList.element());
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.indexOf(70));
		System.out.println(linkedList.offer(100));
		System.out.println(linkedList);
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		linkedList.push(101);
		System.out.println(linkedList);
		System.out.println(linkedList.size());
	}
	
	public static void main(String[] args) {
		LinkedList1 linkedList1=new LinkedList1();
		linkedList1.method1();
	}
}
