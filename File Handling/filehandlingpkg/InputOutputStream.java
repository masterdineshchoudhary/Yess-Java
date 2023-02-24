package filehandlingpkg;

import java.io.FileOutputStream;

public class InputOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fOutputStream = new FileOutputStream("abc.txt");
			fOutputStream.write(100);
			fOutputStream.close();
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
