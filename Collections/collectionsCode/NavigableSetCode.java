package collectionsCode;

import java.util.NavigableSet;
import java.util.TreeSet;

// floor() - returns lowest element which is <=e
// lower() - returns lowest element which is <e
// ceiling() - returns highest element which is >=e
// higher() - returns highest element which is >e
// pollfirst() - remove and return first element
// polllast() - remove and return first element
// descendingSet() - returns NavigableSet in reverse order

public class NavigableSetCode {
	public static void main(String[] args) {
		NavigableSet nSet = new TreeSet();
		for(int i=1000; i<=6000; i=i+1000) {
			nSet.add(i);
		}
		
		System.out.println(nSet);
		
		System.out.println(nSet.ceiling(2000));
		System.out.println(nSet.higher(2000));
		System.out.println(nSet.floor(2000));
		System.out.println(nSet.lower(2000));
//		System.out.println(nSet.pollFirst());
//		System.out.println(nSet.pollLast());
		System.out.println(nSet.descendingSet());
		System.out.println(nSet.headSet(4000));
		System.out.println(nSet.tailSet(4000));
		System.out.println(nSet.subSet(3000, 5000));
	}
}
