package classtest;

public class EvenOdd {
	public static void main(String[] args) {
		int even=0, odd=0;
		for(int i=1; i<=100; i++) {
			if (i%2==0) {
				even++;
			}
			if (i%2!=0) {
				odd++;
			}
		}
		System.out.println("Total Even Numbers in range (1,100) is "+even);
		System.out.println("Total Odd Numbers in range (1,100) is "+odd);
	}
}
