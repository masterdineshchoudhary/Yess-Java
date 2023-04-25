package queueprograms;

import java.util.PriorityQueue;

// homogeneous elements are allowed otherwise ClassCastException
// Null insertion in not possible
// Insertion order is not preserved because it is based in some priority
// priority may be Default sorting order or customized sorting order defined by Comparator object

// methods :
// boolean offer(object o);
// object peek(); - return head element ,if queue is empty then returns null 
// object element(); - return head element ,if queue is empty then returns throws RE 
// object poll(); - remove and return head element ,if queue is empty then returns null 
// object remove(); - remove and return head element ,if queue is empty then throws NoSuchElementException


public class PriorityQueueCode {
	public static void main(String[] args) {
		PriorityQueue pQueue = new PriorityQueue<>();
		System.out.println(pQueue.peek());
//		for (int i = 1; i <= 10; i=i+2) {
//			pQueue.offer(i);
//		}
		pQueue.offer("a");
		pQueue.offer("g");
		pQueue.offer("e");
		pQueue.offer("c");
		pQueue.offer("d");
		pQueue.offer("b");
		System.out.println(pQueue);
//		System.out.println(pQueue.poll());
//		System.out.println(pQueue);
		
	}
}
