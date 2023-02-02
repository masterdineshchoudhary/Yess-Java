package thiskeyword;

public class Show {
	int i;
	
//	void setValue(int num) {
//		i = num;
//	}
	void setValue2(int i) {
		this.i = i;
	}
	
	void show() {
		System.out.println(i);
	}
	
	void m1() {
		System.out.println("Hello");
	}
	void display() {
		this.m1();
	}
	
	// this can be passed as an argument in the method call
	void m2(Show sb) {
		System.out.println("Hi"); }
	void m3() {
		m2(this);
		System.out.println("Dinesh"); }
	
	// this can be passed as an argument in the constructor call
	public Show() {
		this(10);
		System.out.println("Default const");
	}
	public Show(int i) {
		this("rohit");
		System.out.println("int const");
	}
	public Show(String s) {
		System.out.println("string const");
	}
	
	public static void main(String[] args) {
		Show ssShow = new Show();
	}
	
}
