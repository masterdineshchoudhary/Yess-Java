package queueprograms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueComparator {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue<>(new MyComparator());
		pq.offer("A");
		pq.offer("Z");
		pq.offer("L");
		pq.offer("B");
		pq.offer("S");
		System.out.println(pq);
		
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
