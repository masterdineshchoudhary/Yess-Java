package mapprograms;

import java.util.HashMap;
import java.util.IdentityHashMap;

// it is same as HashMap
// here HashMap uses equals(), whereas IdentityHashMap uses == operator
public class IdentityHashMapCode {
	public static void main(String[] args) {
//		HashMap hashMap = new HashMap<>();
		IdentityHashMap hashMap = new IdentityHashMap<>();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		hashMap.put(I1, "abc");
		hashMap.put(I2, "pqr");
		System.out.println(hashMap);
	}
}
