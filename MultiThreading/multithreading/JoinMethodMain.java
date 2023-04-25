package multithreading;

public class JoinMethodMain {
	public static void main(String[] args) throws InterruptedException {
		MyThread6 t4 = new MyThread6();
		MyThread6.mt = Thread.currentThread();
		t4.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main");
		}
	}
}

class MyThread6 extends Thread {
	static Thread mt;

	public void run() {
		try {
			mt.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
