package classtest;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact=1, num;
		System.out.println("Enter Number : ");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		int temp=num;
		while(num>0) {
			fact = fact * num;
			num--;
		}
		System.out.print("factorial of given number "+temp+" is "+fact);
		scanner.close();
	}
}
