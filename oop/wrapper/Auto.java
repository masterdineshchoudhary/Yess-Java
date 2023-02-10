package wrapper;

// AUTO BOXING
// automatic conversion of primitive data types into its corresponding wrapper obj is concept of autoboaxing
// Integer I = 10; (compiler converts int -> Integer obj by using valueOf() method)

// AUTO UNBOXING
// conversion of wrapper object into its corresponding primitive data types
// Integer I = new Integer(10);
// int i = I;
// compiler converts Integer Object into int value using XXXValue() method

public class Auto {
	// Auto Boxing
	static Integer I = 10;
//	static Integer I2;
	public static void main(String[] args) {
		// Auto Unboxing
		int i = I;
		m1(i);
//		int i2 = I2;
//		System.out.println(i2); // NullPointerException
		
		// all wrapper object's are immutable 
		Integer X = 10;
		Integer Y = X;
		X++;
		System.out.println(X);
		System.out.println(Y);
		System.out.println(X==Y);
	}
	// Auto Boxing
	public static void m1(Integer K) {
		// Auto Unboxing
		int m = K;
//		System.out.println(m);
		
	}
}
