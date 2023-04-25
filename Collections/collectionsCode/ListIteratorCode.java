package collectionsCode;

import java.util.LinkedList;
import java.util.ListIterator;

// forward direction - hasNext(), next(), nextIndex()
// backward direction - hasPrevious(), previous(), previousIndex()
// void add(object o)
// void remove(object o)
// void set(object o)


public class ListIteratorCode {
	public static void main(String[] args) {
		LinkedList li = new LinkedList<>();
		li.add("A");
		li.add("B");
		li.add("C");
		System.out.println(li);
		ListIterator litr = li.listIterator();
		while (litr.hasNext()) {
			String string = (String)litr.next();
			if (string.equals("A")) {
				litr.remove();
			}
			else if (string.equals("B")) {
				litr.add("D");
			}
			else if (string.equals("C")) {
				litr.set("E");
			}
		}
		System.out.println(li);
	}
}
