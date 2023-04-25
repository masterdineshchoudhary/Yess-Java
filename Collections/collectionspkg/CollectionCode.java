package collectionspkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// utility class present in java.util package
// it provides some utility methods for collections object
// METHODS: 
// sorting of list elements : sort(List l), sort(List l, Comparator obj)


public class CollectionCode {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Z");
		aList.add("A");
		aList.add("K");
		aList.add("N");
////		aList.add(106); // ClassCastException
////		aList.add(null); // NullPointerException
//		System.out.println("Before - " + aList);
//		Collections.sort(aList);
//		System.out.println("After - " + aList);
//		Collections.reverse(aList);
//		System.out.println("Reversed - " + aList);
//		Collections.sort(aList);
//		System.out.println(aList);
//		System.out.println(Collections.binarySearch(aList,"Z"));
		
		
		System.out.println(aList);
//		Collections.sort(aList);
//		System.out.println(aList);
//		System.out.println(Collections.binarySearch(aList, "N"));
		Collections.sort(aList, new MyComparator());
		System.out.println(aList);
		System.out.println(Collections.binarySearch(aList, "N"));
		System.out.println(aList);
	}
}

class MyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
}
