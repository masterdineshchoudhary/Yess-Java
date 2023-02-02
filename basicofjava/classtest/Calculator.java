package classtest;

import java.util.Scanner;

public class Calculator {
	
	public static int addition(int a, int b) {
		return a+b;
	}
	public static int substraction(int a, int b) {
		return a+b;
	}
	public static int multiplication(int a, int b) {
		return a+b;
	}
	public static double division(int a, int b) {
		return a+b;
	}
	
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
			System.out.println("addition of "+n1+" and "+n2+" is "+addition(n1, n2));
			break;
		case '-':
			System.out.println("substraction of "+n1+" and "+n2+" is "+substraction(n1, n2));
			break;
		case '*':
			System.out.println("multiplication of "+n1+" and "+n2+" is "+multiplication(n1, n2));
			break;
		case '/':
//			System.out.println("division of "+n1+" and "+n2+" is "+division(n1, n2));
			System.out.printf("division of %d and %d is %f ",n1,n2,division(n1, n2));
			break;
		default:
			System.out.println("Invalid Operation");
		}
		s.close();
	}
}
