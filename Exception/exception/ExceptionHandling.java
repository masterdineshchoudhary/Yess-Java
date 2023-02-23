package exception;

// an unwanted unexpected event that disturbs the normal of the program is called an exception
// it is recommended to handle an exception so that rest of the program will continue its execution (if we don't want out program to get terminated abnormally)
// exception handling does not mean repairing an  exception. it is an alternative way to continue the rest of the program
// Runtime Stack Mechanism
// each entry -> activation record / stack frame

// Default Exception Handling:
// if any exception occurs in method it will create an Exception Object(Exception name, description, location(stack trace))
// and it is passed to default exception handler

// Exception Hierarchy:
// Throwable (root class of exception hierarchy)
// 			|			|
// 		Exception 	Error
// exception are of two types (checked exception , unchecked exception)
// checked exception->checked at compile time(Interrupted Exception,IOException, SQLException)
// checked exception types -> fully checked exception, partially checked exception
// unchecked exception->checked at runtime(Error and its subclass ,RunTime Exception and its subclass)

// three ways to handle exception
// 1. try-catch:
// syntax :
//		try {
			//Risky Code
//		} catch (Exception e) {
			// Exception handling code
//		}
// 2. Throws keyword -> for checked exception only
// 3. Throw Keyword -> customized exception

// 2 types of exception 
// JVM Exception - 
// --> ArrayIndexOfBound, NullPointerException, 
// ClassCastException (parent obj to child obj) -> 
// Object o = new Object("Java")
// String s = (String) o;  // ClassCastException
// StackOverFlow -> recursive method calls
/*
 m1() {
 	m2();
 }
 m2() {
 	m1();
 }
 main() {
 	m1();
 }
 
*/
// ExceptionInIntializationError
/*
{
	static x = 10/0;
} 
static {
	String s = null;
	sout(s.length());
}
*/
// IllegalArgumentException
/*
 Thread t = new Thread();
 t.setPriority(7);		-> right
 t.setPriority(15); // as range can be in range of(0,10);
*/
// NumberFormatException
/*
	int i = Integer.parseInt("10");   -> right
	int i = Integer.parseInt("ten");  -> gives Exception
*/
// IllegalStateException 
/*
	// method invoke at unappropriate Time
	Thread t  = new Thread();
	t.start();
	.
	.
	t.start(); 	// invokes again -> gives exception
*/
// AssertionError
/*
	assert(x>10); -> if false then gives error
*/


// Programmatic Exception - 


public class ExceptionHandling {
	public static void main(String[] args) {
		dostuff();
//		System.out.println("Hi");
//		System.out.println("dinesh");
		System.out.println(10/0);
	}
	
	public static void dostuff() {
		doMoreStuff();
		System.out.println("hi");
//		System.out.println(10/0);
	}
	public static void doMoreStuff() {
//		System.out.println(10/0);
		System.out.println("Hello");
	}
}
