package collectionsCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListCode {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("mango");
		al.add("apple");
		al.add("banana");
		al.add("mango");
		System.out.println(al);
		
		Set s1 = new LinkedHashSet(al);
		System.out.println(s1);
		
		Set s2 = new HashSet(al);
		System.out.println(s2);
		
	}
}
