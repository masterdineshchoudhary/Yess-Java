package collectionsCode;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("dinesh");
		l.add(20);
		l.add(null);
		System.out.println(l);
		l.set(2, "java");
		System.out.println(l);
	}
}
