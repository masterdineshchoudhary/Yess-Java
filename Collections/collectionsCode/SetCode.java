package collectionsCode;

import java.util.HashSet;
import java.util.LinkedHashSet;

// default initial capacity is 16 and default fill ratio (0.0 to 1.0), load factor(0.0 to 0.75)
// after filling 75% a new HashSet object will be created
// HashSet h = new HashSet(initial capacity);
// HashSet h = new HashSet(initial capacity, float fill ratio);


public class SetCode {
	public static void main(String[] args) {
//		HashSet h = new HashSet();
		LinkedHashSet h = new LinkedHashSet();
		h.add("apple");
		h.add("grapes");
		h.add(null);
		h.add(5);
		h.add("grapes");
		System.out.println(h);
		System.out.println(h.add("apple"));	
	}
}
