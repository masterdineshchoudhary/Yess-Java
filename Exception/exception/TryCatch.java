package exception;

public class TryCatch {
	public static void main(String[] args) {
		
		dostuff();

		try {
			System.out.println(10/0);
		} catch (Exception e) {
//			 TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dinesh");
		
	}
	
	public static void dostuff() {
		doMoreStuff();
		System.out.println("hi");

	}
	public static void doMoreStuff() {
		System.out.println("Hello");
	}
}
