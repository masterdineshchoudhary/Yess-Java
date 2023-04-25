package mapprograms;

import java.util.TreeMap;

public class TreeMapCode {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap<>();
		tm.put(103, "zzz");
		tm.put(100, "yyy");
		tm.put(101, "xxx");
		tm.put(104, 106);
		tm.put(103, "ccc");
		System.out.println(tm);
//		tm.put("ffg", "xxx"); // ClassCastException
//		tm.put(null, "xxx"); // NullPointerException
//		System.out.println(tm);
	}
}
