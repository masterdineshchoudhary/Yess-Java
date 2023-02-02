package abstraction;

interface MainInterface {
	void method1();
	void method2();
	void method3();
}

abstract class AbsClass implements MainInterface {
	void method4() {
		System.out.println("Mtd 4");
	}
}

class NormalClass extends AbsClass {
	@Override
	public void method1() {
		System.out.println("Mtd 1");
	}
	@Override
	public void method2() {
		System.out.println("Mtd 2");
	}
	@Override
	public void method3() {
		System.out.println("Mtd 3");
	}
}
