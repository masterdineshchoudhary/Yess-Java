package inheritance;

class A {
	public void run() {
		System.out.println("Hi");
	}
}

class B {
	public void run() {
		System.out.println("Hello");
	}
}

//class C extends A, B {
//
//}

public class MultipleInheritance {
	public static void main(String[] args) {
		// Multiple inheritance is not possible using classes - due to data ambiguity
		// by possible by interfaces
		
		// Class can extends only one Class
		// Class cannot extends more than one Class
		// Class can implements more than one Interfaces
//		C objC = new C();
//		objC.run();
	}
}
