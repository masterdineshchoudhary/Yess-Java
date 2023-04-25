package multithreading;

// it consumes less memory & gives fast & efficient performance
// types :
// -> process-based multitasking
// -> thread-based multitasking - executing multiple task simultaneously when such task is a separate independent part of the same program
// each separate independent task is called thread
// thread is a light-weight subprocess, shares common memory area
// executing multiple task simultaneously where each task is a separate independent process or program
// this is best suitable at operating system level

//public class MultiThreadingJava extends Thread {
public class MultiThreadingJava implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("child thread");
		}
	}
}
