package controlstatements;

public class Break {
	
	public static void main(String[] args) {
		// break: 
		// break in for loop
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			if (i==5) {
//				break;
//			}
//		}
	
		// break in while Loop
//		int i=1;
//		while (i<=10) {
//			System.out.println(i);
//			if (i==6) {
//				break;
//			}
//			i++;
//		}
		
		// break in do while Loop
//		int i=1;
//		do {
//			System.out.println(i);
//			if (i==4) {
//				break;
//			}
//			i++;
//		} while(i<=10);
		
		
		// User defined block
		li:
		{
			for(int i=0; i<=5; i++) {
				System.out.println(i);
				if (i==3) {
					break li;
				}
			}
		}
	
		
	}
	
	
}
