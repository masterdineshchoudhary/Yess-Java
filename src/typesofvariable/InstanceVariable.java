package typesofvariable;

public class InstanceVariable {
	// instance variable has a global scope
	int x=10;
	char ch;
	int a;
	String string;
	
	public void method1() {
		System.out.println(x);
	}
	
	public static void method2() {
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.x);
	}
	
	public static void main(String[] args) {
		
		InstanceVariable obj = new InstanceVariable();
		System.out.println(obj.x);
		
		// non-static method call using object
		obj.method1();
		
		// static method access directly
		method2();
		
		// default values
		System.out.println(obj.ch);
		System.out.println(obj.a);
		System.out.println(obj.string);
	}
}
