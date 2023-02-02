package instancecontrolflow;

public class ChildTest extends ParentTest {
	int i=10;
	
	// instance block 1
	{
		m1();
		System.out.println("child first instance block");
	}
	
	// constructor
	ChildTest() {
		System.out.println(j);
	}
	
	// main
	public static void main(String[] args) {
		ChildTest test = new ChildTest();
		System.out.println("child main");
	}
	
	// m1() method
	public void m1() {
		System.out.println(j);
	}
	
	// instance block 2
	{
		System.out.println("child second instance block");
	}
	int j= 20;
}
