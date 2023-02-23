package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatch2 {
	public static void main(String[] args) {
		/*
		try {
			System.out.println("Statement 1");
			System.out.println("Statement 2");
			System.out.println(10/0);
			System.out.println("Statement 3");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Below is the error : ");
			e.printStackTrace(); //name, description, location //default
			e.toString(); //name, description
			e.getMessage(); //description
		}
		*/
		
		try {
			PrintWriter pWriter = new PrintWriter("abc.txt");
			pWriter.write("hello");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(10/0);
//		System.out.println("Statement 4");
	}
}
