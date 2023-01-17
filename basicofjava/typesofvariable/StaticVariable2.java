package typesofvariable;

public class StaticVariable2 {
	public static void main(String[] args) {
		
		// call using object of class
		StaticVariable obj= new StaticVariable();
		System.out.println(obj.x);
		
		// call using class name
		System.out.println(StaticVariable.x);
		
	}
}
