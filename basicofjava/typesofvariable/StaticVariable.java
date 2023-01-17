package typesofvariable;

public class StaticVariable {
	// static variable is a class variable
	static int x = 10;
	public static void main(String[] args) {
		
		// directly access
		System.out.println(x);
		
		// using object of class
		StaticVariable obj = new StaticVariable();
		System.out.println(obj.x);
		
		// using class name
		System.out.println(StaticVariable.x);
	}
}
