package controlstatements;

public class While {
	public static void main(String[] args) {
		// case1: unreachable
//		while (true) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");
		
		// case2: unreachable
//		while (false) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");
		
		// case3: Infinite Hello
//		int a=10, b=20;
//		while (a<b) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");
		
		// case4: prints Hi
//		int a=10, b=20;
//		while (a>b) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");
		
		// case5: unreachable
//		final int a=10, b=20;
//		while (a>b) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");
		
		// case6: unreachable
//		final int a=10, b=20;
//		while (a<b) {
//			System.out.println("Hello");
//		}
//		System.out.println("Hi");
		
		//program1: 
		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		
		
	}
}
