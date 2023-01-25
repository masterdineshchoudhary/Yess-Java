package constructor;

// Block of code similar to object
// it is called when an instance (at the time of object creation) of the class is created
// it is used at the time of calling constructor, memory for the object is allocated in the memory
// main purpose of constructor is to perform initialization if an object

// Types : 
// 1. Default (No Argument) Constructor
// 2. Parameterized Constructor

// Rules : 
// constructor name must be the same as class name
// Constructor must no have explicit return type
// a java constructor cannot access final, static or synchronized
// but we can have private, public, default or protected constructor in java

// Case:
// 1. this() or super() should be the first in the constructor
// 2. this() and super() cannot be placed simultaneously in constructor
// 3. this() and super() must be placed within in the constructor

public class Constructor {
	int i;
	float f;
	String s;
	
	// Non-Parameterized constructor
	public Constructor() {
		System.out.println("no-arg constructor");
	}
	
	// Parameterized constructor
	public Constructor(int i, float f, String s) {
		super();
		this.i = i;
		this.f = f;
		this.s = s;
	}
	
	public static void main(String[] args) {
		// constructor call 
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(1, 2, "string");
		System.out.println(c2.i + " - " + c2.f + " - " + c2.s);
	}	
}
