package inheritance;

class AA {
	public void display() {
		System.out.println("In class A");
	}
}
class BB extends AA {
	public void show() {
		System.out.println("In class B");
	}
}
class CC extends AA {
	public void display3() {
		System.out.println("In class C");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		
		BB b = new BB();
		b.display();
		b.show();
		
		CC c = new CC();
		c.display();
		c.display3();
	}
}
