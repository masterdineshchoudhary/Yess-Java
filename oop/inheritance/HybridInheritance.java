package inheritance;
// Hybrid Inheritance - is the composition of two or more inheritance types

class GrandFather {
	public void showG() {
		System.out.println("Grandfather");
	}
}
// single inheritance
class Father extends GrandFather {
	public void showF() {
		System.out.println("Father");
	}
}

// hierarchical and multilevel inheritance 
class Son extends Father {
	public void showS() {
		System.out.println("Son");
	}
}

// hierarchical and multilevel inheritance
class Daughter extends Father {
	public void showD() {
		System.out.println("Daughter");
	}
}

// Interface 
interface i1 {
	abstract void name1();
}
interface i2 {
	abstract void name2();
}

// Interface Implementations using class ImpClass
class ImpClass extends GrandFather implements i1, i2 {
	public void name1() {
		System.out.println("Name 1");
	}
	public void name2() {
		System.out.println("Name 2");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		
		// FATHER calls
		System.out.println("Father Calls : ");
		Father f1 = new Father();
		f1.showF();
		f1.showG();
		
		// SON calls
		System.out.println("\nSon Calls : ");
		Son s1 = new Son();
		s1.showS();
		s1.showF();
		s1.showG();
		
		// DAUGHTER calls
		System.out.println("\nDaughter Calls : ");
		Daughter d1 = new Daughter();
		d1.showD();
		d1.showF();
		d1.showG();
		
		// ImplClass calls
		System.out.println("\nInterface : ");
		ImpClass impClass = new ImpClass();
		impClass.showG();
		impClass.name1();
		impClass.name2();
	}
}
