package classtest;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int n1, n2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers (n1 and n2 ) :");
		n1 = s.nextInt();
		n2 = s.nextInt();
		char opr;
		System.out.println("Enter Operator : ");
		opr = s.next().charAt(0);
		switch (opr) {
		case '+':
			System.out.println("Addition : " + (n1+n2));
			break;
		case '*':
			System.out.println("Multiplication : " + (n1*n2));
			break;
		case '-':
			System.out.println("Subraction : " + (n1-n2));
			break;
		case '/':
			System.out.println("Divsion : " + (n1/n2));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
}
