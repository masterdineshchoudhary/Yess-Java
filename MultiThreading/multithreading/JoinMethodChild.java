package multithreading;

// if thread t1 wants to wait until thread t2 completes it execution then t1 thread calls join() method on t2 object.

public class JoinMethodChild {
	public static void main(String[] args) throws InterruptedException {
		MyThread4 t4 = new MyThread4();
//		Thread t5 = new Thread();
		t4.start();
		t4.join();
		for(int i=0;i<5;i++) {
			System.out.println("main");
		}
	}
}

class MyThread4 extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
		}
	}
}
