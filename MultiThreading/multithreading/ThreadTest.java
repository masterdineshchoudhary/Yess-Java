package multithreading;

/*
class Thread {
	public void start() {
		1. Register thread wit thread schedular
		2. Perform other mandatory activities
		3. call run() method
	}
*/

// recommended to override run() but not start()
// life cycle - >
// 1. new thread created - new born
// 2. t.start() - ready/runnable
// 3. if thread state allocate processor - running state
// 4. run() methods execution complete
// 5. Dead


public class ThreadTest {
	public static void main(String[] args) {
		MultiThreadingJava t = new MultiThreadingJava();
		Thread t2 = new Thread(t);
//		t.start();
//		t2.start();
//		t2.stop();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		
		System.out.println("MIN and MAX");
		Thread.currentThread();
		int i = Thread.MAX_PRIORITY;
		Thread.currentThread();
		int j = Thread.MIN_PRIORITY;
		System.out.println("max is " + i);
		System.out.println("min is " + j);
		
		// child thread
		System.out.println("child thread");
		System.out.println(t2.getPriority());
		t2.setPriority(10);
		System.out.println(t2.getPriority());
		
//		t2.start();
		
		// main thread
		System.out.println("main thread");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		
		t2.start();
		
	}
}
