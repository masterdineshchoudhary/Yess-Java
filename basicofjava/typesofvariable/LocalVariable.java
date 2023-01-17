package typesofvariable;

public class LocalVariable {
	
	
	public void m1() {
		int a=5;
		System.out.println(a);
	}
	
	// m2 cannot access local variable of m1
//	 public void m2() {
//		System.out.println(a); //error
//	}
	
	public static void main(String[] args) {
		int i=10,j;
		for(j=0;j<4;j++) {
			i=i+j;
		}
		System.out.println(i+" - "+j);
		
		LocalVariable localVariable = new LocalVariable();
		localVariable.m1();
	}
}
