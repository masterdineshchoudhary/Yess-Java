package oops;

public class TestMethod {
	
	int ex = 6;
	public void example() {
		System.out.println(ex);
	}
	
	public static void main(String[] args) {
		
			Methods t = new Methods();
			t.m1();
			
			// accessing variables
			System.out.println(t.x + " - " + Methods.y);
			System.out.println(t.x + " - " + t.y);
			
			// reassigning
			t.x = 20;
			t.y = 30;
			
			System.out.println(t.x + " - " + t.y);
			Methods t2 = new Methods();

			System.out.println(t2.x + " - " + t2.y);
			
			
			TestMethod testMethod = new TestMethod();
			testMethod.example();
	}
}
