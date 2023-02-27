package oop;

public class MainBankAgg {
	public static void main(String[] args) {
		UserInfo userInfo = new UserInfo(123, "dinesh");
		BankOperations bankOperations = new BankOperations(20000, 500, 0, userInfo);
		System.out.println(bankOperations.balance);
		System.out.println(bankOperations.deposit);
		System.out.println(bankOperations.balance);
		System.out.println(bankOperations.withdraw);
		
		System.out.println(bankOperations.toString());
	}
}
