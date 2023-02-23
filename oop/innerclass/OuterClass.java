package innerclass;

// class which is directly declared within a class
// BASED on position of declaration and behaviour, all innner classes are divided into 4 types
// 1. Normal or Regular inner class -> static members cannot be defined inside but can be accessed in the static area, also main method cannot be taken
// 2. Method local inner class
// 3. Anonymous inner class
// 4. Static nested class


public class OuterClass {
	
	int x = 10;
	static int y = 20;
	class InnerClass {
		public void m1() {
			System.out.println("Inner Class");
			System.out.println(x + " - " + y);
		}
	}
	
	private void m2() {
		InnerClass iClass = new InnerClass();
		System.out.print("Instance methods : ");
		iClass.m1();
	}
	public static void main(String[] args) {
		
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.m1();
		
		outerClass.m2();
		
		// short syntax
		OuterClass.InnerClass i = new OuterClass().new InnerClass();
		i.m1();
		
		// short syntax
		new OuterClass().new InnerClass().m1();
		
		
	}
}
