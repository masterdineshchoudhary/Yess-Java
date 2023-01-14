package controlstatements;

public class Continue {
	public static void main(String[] args) {
		// continue in for Loop
//		System.out.println("Even Numbers : ");
//		for(int i=0; i<=10; i++) {
//			if (i%2==0) {
//				continue;
//			}
//			System.out.print(i+ " ");
//		}
//		
//		System.out.println("\nOdd Numbers : ");
//		for(int i=0; i<=10; i++) {
//			if (i%2!=0) {
//				continue;
//			}
//			System.out.print(i+ " ");
//		}
		
		// program: 
		int x = 0;  //0
		do {
			x++;	//0+1 , 3+1, 7+1
			System.out.println(x);	//1 , 4, 8
			if (++x<5) {	//2, 5
				continue;
			}
			x++; // 5+1, 8+1
			System.out.println(x); //6
		} while (++x<10);	//3 //7
		
	}
}
