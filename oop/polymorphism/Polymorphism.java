package polymorphism;

// Polymorphism : many forms 
// types - 
// 1. compile time polymorphism (static or early binding) - achieved by overloading - handled by compiler
// 2. run time polymorphism (dynamic or late binding) - achieved by overriding - handled by JVM

// Overloading - 
// methods are said to be overloaded if same method name but different arguments
// same class, same method name
// different arguments - no.of arguments, type of arguments, order of arguments

public class Polymorphism {
	public void m1() {
		System.out.println("no-args");
	}
	public void m1(int i) {
		System.out.println("int-args : ");
	}
	public void m1(float d) {
		System.out.println("float-args : ");
	}
	public void m1(String s) {
		System.out.println("string-args : ");
	}
	
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.m1();
		polymorphism.m1(5);
		polymorphism.m1(10.5f);
		polymorphism.m1("Dinesh");
		polymorphism.m1('a');
		polymorphism.m1(10L);
	}
	
}
