package innerclass;

// applicable access modifier : 
// applicable Outer Class -> default, public, final(no inheritance), abstract(no instantiation)
// Inner Class -> default, public, final, abstract, private, protected

public class Outer2 {
	int x =10;
	class Inner2 {
		int x =100;
		private void m4() {
			int x = 1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer2.this.x);
		}
	}
	
	public static void main(String[] args) {
		new Outer2().new Inner2().m4();
	}
}
