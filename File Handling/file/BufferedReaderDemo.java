package file;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr3 = new FileReader("mno.txt");
			BufferedReader br3 = new BufferedReader(fr3);
			String line = br3.readLine();
			while (line!=null) {
				System.out.println(line);
				line = br3.readLine();
			}
			br3.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
