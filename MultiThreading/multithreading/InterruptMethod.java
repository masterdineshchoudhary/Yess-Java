package multithreading;

public class InterruptMethod {
	public static void main(String[] args) {
		MyThread8 t8 = new MyThread8();
		t8.start();
		t8.interrupt();
		System.out.println("main thread");
	}
}

class MyThread8 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am a lazy thread " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("I got interrupted");
			}
		}
	}
}
