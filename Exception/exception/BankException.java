package exception;

import java.util.Scanner;

public class BankException {
	public static void main(String[] args) {
		int balance;
		int withdraw;
		int remaining;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Balance : ");
		balance = scanner.nextInt();
		System.out.println("Enter Withdraw amount : ");
		withdraw = scanner.nextInt();
		remaining = balance-withdraw;
		System.out.println("Remaining balance = "+remaining);
		if (remaining<0) {
			throw new noSufficientBalance("Balance not sufficent");
		} else {
			System.out.println("Transaction completed");
		}	
	}
}
class noSufficientBalance extends RuntimeException {
	public noSufficientBalance(String s) {
		super(s);
	}
}
