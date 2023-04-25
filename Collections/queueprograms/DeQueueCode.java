package queueprograms;

import java.util.ArrayDeque;
import java.util.Deque;

// total 22 methods : 

public class DeQueueCode {
	public static void main(String[] args) {
		Deque dq = new ArrayDeque<>();
		
		dq.offer("a");
		dq.offer("g");
		dq.offer("e");
		dq.offer("c");
		dq.offer("d");
		dq.offer("b");
		System.out.println(dq);
		
//		dq.add("A");
//		dq.addFirst("B");
//		dq.addLast("D");
//		dq.add("S");
//		System.out.println(dq);
//		System.out.println(dq.pop());
//		System.out.println(dq.poll());
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollLast());
//		dq.push("G");
//		System.out.println(dq);		
	}
}
