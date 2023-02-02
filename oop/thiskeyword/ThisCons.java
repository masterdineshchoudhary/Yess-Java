package thiskeyword;

public class ThisCons {
	
	void m1() {
		ThisTest t = new ThisTest(this);
	}
	
	ThisCons m2() {
		return this;
	}
	
	public static void main(String[] args) {
		ThisCons t = new ThisCons();
		t.m1();
		System.out.println(t.m2());
	}
}
