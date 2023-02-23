package exception;

import java.io.IOException;

// throw keyword is used for customized exception or used defined exception
// we can create our own exception object explicitly and hand it over to the JVM manually. for this requirement we can use throw keyword.
// syntax :
//	throw new AE("/by zero");
// throw keyword for checked exception should be handled, unchecked exception need not be handled 

/*
public class Throw {
	
//	static ArithmeticException e = new ArithmeticException();
//	static ArithmeticException e = new ArithmeticException("/error");
	static ArithmeticException e;
	
	public static void main(String[] args) {
//		throw new ArithmeticException("/not possible");
		throw e;
//		not allowed after throw keyword gives compiler error
//		System.out.println("hello");
	}
}
*/

public class Throw extends RuntimeException {
	public static void main(String[] args) {
//		No exception of type Throw can be thrown; an exception type must be a subclass of Throwable
//		for that we will extend Class by RuntimeException
//		throw new Throw();
		
		
//		throw new Exception();  // checked exception should be handled
//		throw new Error(); // unchceked exception need not be handled
		
		
//	// as IOException is fully checked exception it gives error if no exception occurs
//		for partially checked exception it will give no error
		try {
			System.out.println("Hello");
		} catch (IOException e) {  
			e.printStackTrace();
		}
	}
}

