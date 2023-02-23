package exception;

public class MutlipleCatchBlock {
	public static void main(String[] args) {
		/*
		try {
			int[] a = new int[5];
			a[4] = 10/0;
			System.out.println(a[5]);
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		} catch (Exception e) {
			System.out.println("Exception occurs");
		} System.out.println("rest of the code");
		*/
		
		try {
			String string = null;
			System.out.println(string.length());
		} 
		
		// Parent class Exception cannot be placed above its subclass
//		catch (Exception e) {
//			System.out.println("Exception occurs");
//		} 
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		} catch (Exception e) {
			System.out.println("Exception occurs");
		} System.out.println("rest of the code");
		
		
//		IllegalArgumentException -> NumberFormatException
	}
}
