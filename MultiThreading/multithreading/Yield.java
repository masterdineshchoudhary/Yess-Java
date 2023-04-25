package multithreading;

// yield method is used to stop current executing thread & gives chance to the other waiting thread of the same priority
// if there is no waiting thread or low priority thread then the same thread will continue its execution
// public static void yield();

public class Yield {
	public static void main(String[] args) {
		MyThread t3 = new MyThread();
		t3.start();
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
		
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
