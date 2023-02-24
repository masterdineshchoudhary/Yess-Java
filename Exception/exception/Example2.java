package exception;

public class Example2 {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			String string = "dinesh";
			String string2 = null;
			System.out.println(string.length());
		} catch (ArithmeticException | NullPointerException e) {
//		} catch (RuntimeException | NullPointerException e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
