package mapprograms;

// if an object does not have ref var it will be eligible garbage collector even though it is associated with weak hash map
// garbage collector dominates weakHashMap
// in case of HashMap, eventhough object does not ref var it will not be garbage collected

import java.util.WeakHashMap;

public class WeakHashMapCode {
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap weakhm = new WeakHashMap<>();
		Temp temp = new Temp();
		weakhm.put(temp, "abc");
		System.out.println(weakhm);
		temp = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakhm);
	}
}

class Temp {
	@Override
	public String toString() {
		return "temp";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
}

