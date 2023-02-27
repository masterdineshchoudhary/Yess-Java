package filehandlingpkg;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// file is generated in the eclipse-workspace

public class InputOutputStream {
	public static void main(String[] args) {
		
		// WRITE
		try {
			// FileOutputStream
			FileOutputStream fOutputStream = new FileOutputStream("abc.txt");
			String string = "Hello World dinesh";
			char[] s = string.toCharArray();
			for (char c : s) {
				fOutputStream.write(c);
			}
//			byte[] s = string.getBytes();
//			fOutputStream.write(s,3,6);
//			fOutputStream.write(98);
//			fOutputStream.write(99);
			
			
			// BufferedOutputStream
			BufferedOutputStream bout = new BufferedOutputStream(fOutputStream);
			byte[] b = string.getBytes();
			bout.write(b);
			bout.flush();
			bout.close();
			
	
			fOutputStream.close();
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		// READ
		try {
			// FileInputStream
			FileInputStream fileInputStream = new FileInputStream("abc.txt");
			int i = 0;
			while ((i=fileInputStream.read())!=-1) {
				System.out.print((char)i);
			}
			
			// BufferedInputStream
			BufferedInputStream biut = new BufferedInputStream(fileInputStream);
			int j = 0;
			while ((j=biut.read())!=-1) {
				System.out.print((char)j);
			}
			biut.close();
			
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
