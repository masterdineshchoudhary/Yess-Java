package oopsobject;

// equals method -> used to check equality b/w two objects 
// public boolean equals(object o)
// it is meant for address comparison
// it only returns true if both reference variable points to the same object
// eg -> s2.equals(s1);

// Object, StringBuffer class -> address comparison
// String class -> content comparison
// == -> address comparison

public class EqualsMtd {
	String name;
	int empId;
	public EqualsMtd(String name, int empId) {
		this.name = name;
		this.empId = empId;
	}
	public static void main(String[] args) {
//		EqualsMtd eq1 = new EqualsMtd("A", 101);
//		EqualsMtd eq2 = new EqualsMtd("B", 202);
//		EqualsMtd eq3 = new EqualsMtd("A", 101);
//		EqualsMtd eq4 = eq2;
//		System.out.println(eq1.equals(eq2));
//		System.out.println(eq1.equals(eq3));
//		System.out.println(eq2.equals(eq3));
//		eq1=eq2;
//		System.out.println(eq1.equals(eq2));
//		System.out.println(eq4.equals(eq2));
		
		String s1 = new String("java");
		String s2 = new String("java");
		// content comparison
		System.out.println(s1.equals(s2));
		// address comparison
		System.out.println(s1==s2);
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		// address comparison
		System.out.println(sb1.equals(sb2));
		// address comparison
		System.out.println(sb1==sb2);
	}
}
