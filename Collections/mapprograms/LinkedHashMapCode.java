package mapprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapCode {
	public static void main(String[] args) {
		LinkedHashMap hMap = new LinkedHashMap();
		hMap.put("Ravi", 700);
		hMap.put("Amit", 800);
		hMap.put("Rohan", 200);
		hMap.put("Priya", 500);
		hMap.put(null, 600);
		
		System.out.println(hMap);
	}
}
