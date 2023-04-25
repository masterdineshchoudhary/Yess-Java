package mapprograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// underlying data structure is HashTable
// duplicate key are not allowed, values can be duplicated
// heterogeneous objects are allowed for key and values
// for keys, null insertion is possible but only once
// for values, any no of null insertion is possible
// insertion order is not preserved because it is based in hash-code of keys
// best choice for search operations

// methods :
// Object put(Object o);
// Object putAll(Map m);
// Object get(Object key); -> returns value
// Object remove(Object key); -> remove entry
// boolean containskey(object key) -> returns boolean value
// boolean containsvalue(object value) -> returns boolean value
// boolean isEmpty();
// int size();
// void clear;

// other methods (collection views of map) :
// Set keySet();
// Collection values();
// Set EntrySet();

// Entry Interface methods (only applicable for entry objects) : /
// without existing Map object, there is no chance of existing Entry objects
// Object getKey();
// Object getValue();
// Object setValue(new Object);

public class HashMapCode {
	public static void main(String[] args) {
		HashMap hMap = new HashMap();
		hMap.put("Ravi", 700);
		hMap.put("Amit", 800);
		hMap.put("Rohan", 200);
		hMap.put("Priya", 500);
		hMap.put(null, 600);
		
		System.out.println(hMap);
		System.out.println(hMap.put("Amit", 1000));
		System.out.println(hMap);
		
		Set s = hMap.keySet();
		System.out.println(s);
		
		Collection c = hMap.values();
		System.out.println(c);
		
		Set s1 = hMap.entrySet();
		System.out.println(s1);
		
		Iterator iterator = s1.iterator();
		while (iterator.hasNext()) {
			Map.Entry m1 = (Map.Entry)iterator.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}
}
