package classtest;

import java.util.Scanner;

public class CreditDebitView {
	static Scanner ssca = new Scanner(System.in);

	static int c,d,v=0;
	public static int view() {
		return v;
	}
	public static int debit(int d) {
		System.out.println("Enter debit ammount : ");
		d = ssca.nextInt();
		v = v+d;
		return d;
	}
	public static int credit(int c) {
		System.out.println("Enter credit ammount : ");
		c = ssca.nextInt();
		v = v-c;
		return c;
	}
	
	public static void main(String[] args) {
		int ch;
		System.out.println("\tMENU");
		System.out.println("1. view");
		System.out.println("2. debit");
		System.out.println("3. credit");
		System.out.println("4. exit");
		while (true) {
			
			System.out.println("Enter choice : ");
			ch =  ssca.nextInt();
			switch (ch) {
			case 1: 
				System.out.println("Balance : " + view());
				break;
			case 2: 
				System.out.println("Rs "+debit(d)+" debited in acc");
				break;
			case 3: 
				System.out.println("Rs "+credit(d)+" credited in acc");
				break;
			case 4: 
				System.out.println("Thank you!");
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
			}			
		}
	}
}	
