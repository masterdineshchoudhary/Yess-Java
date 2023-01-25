package polymorphism;

// COMPILE-TIME POLYMORPHISM
// It is also known as static polymorphism. 
// This type of polymorphism is achieved by function overloading or operator overloading. 
// But Java doesn’t support the Operator Overloading.
// When there are multiple functions with the same name but different parameters then these functions are said to be overloaded. 
// Functions can be overloaded by change in the number of arguments or/and a change in the type of arguments.
// Overloading is based on reference

public class Overloading {
	
	// Method overloading by using Different Types of Arguments
	public int multiply(int a, int b) { return a*b; }
	public double multiply(double a, double b) { return a*b; }
	public static float multiply(float a, int b) { return a*b; }
	
	// Method Overloading by Using Different Numbers of Arguments
	public int multiply(int a, int b, int c) { return a*b*c; }
	public int multiply(int a, int b, int c, int d) { return a*b*c*d; }
	
	// Method Overloading by Using Different Numbers of Arguments
	public float addition(int a, float b) {
		return a+b;
	} 
	public float addition(float a, int b) {
		return a+b;
	} 
	
	
//	public float m3(int a, float b) {
//		System.out.println("int-float");
//		System.out.println((float) a + " " + b);
//		return a+b;
//	} 
//	public float m3(float a, int b) {
//		System.out.println("float-int");
//		System.out.println((float) a + " " + b);
//		return a+b;
//	} 
	
	
	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		
		System.out.println(overloading.multiply(5, 4));
		System.out.println(overloading.multiply(5.4, 4.1));
		System.out.println(Overloading.multiply(5.4f, 2));
		
		System.out.println(overloading.multiply(5, 4, 3));
		System.out.println(overloading.multiply(5, 4, 3, 2));
		
		System.out.println(overloading.addition(5, 2.2f));
		System.out.println(overloading.addition(5.6f, 2));
		
//		overloading.m3(10, 10);
	}
}
