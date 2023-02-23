package innerclass;

public class StaticNested {
	static class Nested {
		public void m1() {
			System.out.println("static nested class method");
		}
	}
	public static void main(String[] args) {
		Nested nested = new Nested();
		nested.m1();
	}
}

class Test6 {
	public static void main(String[] args) {
		StaticNested.Nested n = new StaticNested.Nested();
		System.out.println("call from test6 - ");
		n.m1();
	}
}
