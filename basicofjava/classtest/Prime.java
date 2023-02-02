package classtest;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		int no, count=0;
		Scanner sco = new Scanner(System.in);
		System.out.println("Enter number : ");
		no=sco.nextInt();
		for(int i=2; i<=no-1; i++) {
			if (no%2==0) {
				count++;
			} 
		}
		if (count>0) {
			System.out.println("Not Prime");			
		} else {
			System.out.println("Prime");
		}
//		sco.close();
	}
}
