package exception;

public class FinalizeMethod {
	public static void main(String[] args) {
		FinalizeMethod finalizeMethod = new FinalizeMethod();
		System.out.println(finalizeMethod);
		
		finalizeMethod = null;
		System.gc();
		System.out.println("end of garbage collector");
		System.out.println(finalizeMethod);
		
	}
	protected void finalize() {
		System.out.println("finalize method");
	}
	
}
