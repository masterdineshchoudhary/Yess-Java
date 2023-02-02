package abstraction;

public class BankTest {
	public static void main(String[] args) {
		Bank bank;
		bank = new SBI();
		System.out.println("SBI roi is " + bank.getROI());
		bank = new HDFC();
		System.out.println("HDFC roi is " + bank.getROI());
	}
}
