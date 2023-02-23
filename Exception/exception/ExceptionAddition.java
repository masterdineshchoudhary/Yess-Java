package exception;

import java.util.Scanner;

public class ExceptionAddition {
	
	static int num;
	public static int division(int num) {
		return (num/0);
	}
	
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		try {
			System.out.println(division(num));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
}
