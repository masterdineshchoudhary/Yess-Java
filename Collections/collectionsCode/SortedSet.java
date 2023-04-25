package collectionsCode;

import java.util.Comparator;
import java.util.TreeSet;

// sorted set-> navigable set , tree set
// sorted set methods ->
// first(), last(), headSet(object o), tailSet(object o), subSet(object o1, object o2)
// Comparable Interface (java.util pkg) - contains only one method -> comparedTo(Object o)
// obj1.compareTo(obj2) - obj2 is already present, while obj2 comes later
// obj1 returns +ve when obj1 comes after obj2 -> right
// obj2 returns -ve when obj1 comes before obj2 -> left
// if obj1, obj2 are same then returns 0

// Default Natural sorting order -> homogeneous and non comparable -> comparable interface (java.lang) -> compareTo()
// Customized sorting order -> homogeneous and non comparable -> comparator interface (java.util) -> equals(), compare(obj1, obj2)


public class SortedSet {
	public static void main(String[] args) {
		
//		TreeSet treeSet = new TreeSet<>();
//		treeSet.add("a");
//		treeSet.add("c");
//		treeSet.add("i");
//		treeSet.add("g");
//		treeSet.add("b");
//		System.out.println(treeSet);
//		treeSet.add(4);
//		System.out.println(treeSet); // runtime exception ClassCastException
//		treeSet.add(null);
//		System.out.println(treeSet); // runtime exception NullPointerException
		
//		TreeSet treeSet = new TreeSet();
//		treeSet.add(new StringBuffer("A"));
//		treeSet.add(new StringBuffer("Z"));
//		treeSet.add(new StringBuffer("L"));
//		treeSet.add(new StringBuffer("B"));
//		System.out.println(treeSet);
		
//		TreeSet treeSet = new TreeSet(new NewComparator());
//		treeSet.add("Ravi");
//		treeSet.add("Amit");
//		treeSet.add("Sumit");
//		treeSet.add("Rohan");
//		treeSet.add("Roja");
		
		TreeSet treeSet = new TreeSet(new NewComparator());
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(9);
		treeSet.add(7);
		System.out.println(treeSet);
		
	}
}
class NewComparator implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
//		String s1 = (String) obj1;
//		String s2 = (String) obj2;
		Integer s1 = (Integer) obj1;
		Integer s2 = (Integer) obj2;
//		return s1.compareTo(s2); // ascending order
//		return -s1.compareTo(s2);  // descending order
//		return s2.compareTo(s1);  // descending order
//		return -s2.compareTo(s1); // ascending order
//		return +1;	// simply prints elements from top to bottom print
		return -1;	// simply prints elements from bottom to top print
		
	}
}
