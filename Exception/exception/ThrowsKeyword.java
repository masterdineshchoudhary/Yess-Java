package exception;

// if we wan to delegate(transfer) the responsibility of exception handling to the caller (it may be JVM or another method),
// then we should use throws keyword, then that caller will have to handle that exception
// throws keyword is required for checked exception
// throws keyword is required to convince the compiler, it doe not prevent abnormal termination of the program.

public class ThrowsKeyword {
	public static void main(String[] args) throws InterruptedException {
		doStuff();
	}

	private static void doStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		doMoreStuff();
		
	}

	private static void doMoreStuff() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(10000); // gives compiler error if we don't use thows 
	}
}
