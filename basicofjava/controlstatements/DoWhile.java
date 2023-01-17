package controlstatements;

public class DoWhile {
	public static void main(String[] args) {
		//case1: unreachable Hi
//		do {
//			System.out.println("Hello");
//		} while (true);
//		System.out.println("Hi");
		
		//case2: Prints Hello Hi
//		do {
//			System.out.println("Hello");
//		} while (false);
//		System.out.println("Hi");
		
		
		// case3: Infinite Hello
//		int a=10, b=20;
//		do {
//			System.out.println("Hello");
//		} while (a<b);
//		System.out.println("Hi");
		
		// case4: Hello Hi
//		int a=10, b=20;
//		do {
//			System.out.println("Hello");
//		} while (a>b);
//		System.out.println("Hi");
		
		// case5: unreachable
//		final int a=10, b=20;
//		do {
//			System.out.println("Hello");
//		} while (a<b);
//		System.out.println("Hi");
		
		// case5: Hello Hi
//		final int a=10, b=20;
//		do {
//			System.out.println("Hello");
//		} while (a>b);
//		System.out.println("Hi");
		
		// program1: prints 1-10
		int i=1, n=10;
		do {
			System.out.println(i);
			i++;
		} while (i<=n);
	}
}
