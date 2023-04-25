package mapprograms;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator());
		
		tm.put("aaa", 40);
		tm.put("XXX", 103);
		tm.put("vvv", 505);
		tm.put("gfg", 5);
		tm.put(10, 50);
		System.out.println(tm);
	}
}

class MyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
