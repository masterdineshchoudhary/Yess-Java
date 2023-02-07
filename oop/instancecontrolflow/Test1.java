package instancecontrolflow;

public class Test1 {
	// first instance block
	{
		System.out.println("FIB");
	}
	
	// first static block
	static
	{
		System.out.println("FSB");
	}
	
	// constructor
	Test1() {
		System.out.println("Constructor");
	}
	
	// main
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println("main");
		Test1 test2 = new Test1();
	}
	
	// first static block
	static {
		System.out.println("SSB");
	}
	
	// second instance block
	{
		System.out.println("SIB");
	}
	
}
