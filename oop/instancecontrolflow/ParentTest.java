package instancecontrolflow;

public class ParentTest {
int x=10;
	
	// instance block 1
	{
		m1();
		System.out.println("parent first instance block");
	}
	
	// constructor
	ParentTest() {
		System.out.println(y);
	}
	
	// main
	public static void main(String[] args) {
		ParentTest parentTest = new ParentTest();
		System.out.println("parent main");
	}
	
	// m1() method
	public void m1() {
		System.out.println(y);
	}
	
	// instance block 2
	{
		System.out.println("parent second instance block");
	}
	int y= 300;
}
