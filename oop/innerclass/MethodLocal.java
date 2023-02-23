package innerclass;

// class inside a method
// this class is not accessible outside the method
// in instance method we can access both members
// in static method we can access only static members

public class MethodLocal {
	int a = 15; // a cannot be accessed bcoz mtd is static
	static int b = 25;
	public static void m1() {
		int z = 50;
		class Inner2 {
			public void sum(int x, int y) {
				System.out.println("sum is " + (x+y));
//				System.out.println(a+" - "+b);
				System.out.println(z);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.sum(10, 20);
		inner2.sum(100, 200);
	}
	
	public static void main(String[] args) {
		MethodLocal methodLocal = new MethodLocal();
		methodLocal.m1();
	}
}
