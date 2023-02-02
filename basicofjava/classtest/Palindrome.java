package classtest;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = scan.nextInt();
		int rem, rev = 0, temp = n;
		while(n>0) {
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		System.out.println("Reverse is : " + rev);
		if (rev == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		scan.close();
	}
}
