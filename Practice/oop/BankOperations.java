package oop;

import java.util.Scanner;

public class BankOperations {
	int deposit, withdraw, balance;
	
	
	UserInfo userInfo;

	public BankOperations(int deposit, int withdraw, int balance, UserInfo userInfo) {
		super();
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
		this.userInfo = userInfo;
	}

	public void depositMoney() {
		Scanner scanner = new Scanner(System.in);
		deposit = scanner.nextInt();
		balance += deposit;
		System.out.println("deposited money " + balance);
		System.out.println(balance);
	}
	
	public void withdrawMoney() {
		Scanner scanner = new Scanner(System.in);
		withdraw = scanner.nextInt();
		System.out.println("withdraw amount " + withdraw);
		balance -= withdraw;
		System.out.println(balance);
	}
	
	@Override
	public String toString() {
		return userInfo.userName + " - " + userInfo.userPhone;
	}
	
}
