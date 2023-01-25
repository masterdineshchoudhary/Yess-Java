package polymorphism;

public class OverloadingEx2 {
	int n1, n2;
	String operation;
	public OverloadingEx2() {
		n1 = 0;
		n2 = 0;
		this.operation = "Nothing";
	}
	public OverloadingEx2(int i) {
		n1 = i;
		n2 = 0;
		operation = "Nothing";
	}
	public OverloadingEx2(int i, int j) {
		n1 = i;
		n2 = j;
		operation = "Nothing";
	}
	public OverloadingEx2(int i, int j, String o) {
		n1 = i;
		n1 = j;
		operation = o;
	}
	
	public static void main(String[] args) {
		OverloadingEx2 ex2 = new OverloadingEx2();
		System.out.println(ex2.n1+" "+ex2.n2+" "+ex2.operation);
	}
}
