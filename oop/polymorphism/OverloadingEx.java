package polymorphism;

public class OverloadingEx {
	public void m1(String s) {
		System.out.println("string-version");
	}
	public void m1(Object o) {
		System.out.println("object-version");
	}
	public void m1(StringBuilder b) {
		System.out.println("stringBuilder-version");
	}
	
	public static void main(String[] args) {
		OverloadingEx oEx = new OverloadingEx();
		oEx.m1("dinesh");
		oEx.m1(new Object());
		oEx.m1(new StringBuilder("Java"));
//		oEx.m1(null);
	}
}
