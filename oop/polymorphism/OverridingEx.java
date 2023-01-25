package polymorphism;

// Overloading(CompileTime Poly) 
//- same class, same mtd name, diff args(no.ofarg, type.of.arg, order.of.arg)
//- mtd execution is handled by the compiler based on refrence
// Overriding(RunTime Ploy - 
//- diff class, same mtd name, same args(no.ofarg, type.of.arg, order.of.arg)
//- Inheritance
//- mtd execution is handled by the JVM based on run time object
// 
// final 

class Parent2 {
	public int m1() {
		return 1;
	}
}

class Child {
	public int m1() {
		return 2;
	}
}

public class OverridingEx {
	public static void main(String[] args) {
		OverridingEx riding = new OverridingEx();
	}
}

