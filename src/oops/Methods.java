package oops;


public class Methods {
	
	int x=5;
	static int y=10;
	
	// Instance Method
	public void m1() {
		System.out.println("Hello");
	}
	
	// Static Method
	public static void m2() {
		System.out.println("Hi");
	}
	
	// With no access modifier
	void m3() {
		System.out.println("Java");
	}

	
	public static void main(String[] args) {
		// Instance method calling by creating object
		Methods methods = new Methods();
		methods.m1();
		
		// Static method calling directly by method name
		m2();
		
		// method calling by creating object
		methods.m3();
		
	}
}
