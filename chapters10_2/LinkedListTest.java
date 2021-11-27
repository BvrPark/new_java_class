package chapters10_2;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		list.add(1,"D");
		System.out.println(list);
		
		list.addFirst("E");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.addLast("L");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove();
		System.out.println(list);
		
	}

}
