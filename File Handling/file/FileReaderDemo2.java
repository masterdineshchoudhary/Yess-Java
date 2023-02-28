package file;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo2 {
	public static void main(String[] args) {
		File f2 = new File("mno.txt");
		char ch2[] = new char[(int)f2.length()];
		try {
			FileReader fr2 = new FileReader(f2);
			fr2.read();
			for(char ch1 : ch2) {
				System.out.println(ch1);
			}
			fr2.close();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
