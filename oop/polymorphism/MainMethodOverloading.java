package polymorphism;

public class MainMethodOverloading {
	public static void main(String[] args) {
		System.out.println("string-arg method");
		main(5);
		main(4.5);
	}	
	
	public static void main(int arg) {
		System.out.println("int-arg method");
	}
	public static void main(double arg) {
		System.out.println("double-arg method");
	}
}
