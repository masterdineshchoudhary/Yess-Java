package superkeyword;

public class SuperB extends SuperA {
	int a = 5;
	static int b = 10;
	
	public SuperB() {
		super();
		System.out.println("Child class Constructor");
	}
	
	void m1() {
		System.out.println("I am in class B");
	}
	
	void show() {
		super.m1();
		this.m1();
		System.out.println(super.a);
		System.out.println(this.a);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		SuperB superB = new SuperB();
		superB.show();
	}
}
