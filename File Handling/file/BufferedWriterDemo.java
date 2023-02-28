package file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fw2 = new FileWriter("jkl.txt");
			BufferedWriter bw2 = new BufferedWriter(fw2);
			bw2.write(97);
			bw2.newLine();
			char[] ch3 = {'b','c','d'};
			bw2.write(ch3);
			bw2.newLine();
			bw2.write("dinesh-new-folder");
			bw2.newLine();
			bw2.flush();
			bw2.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
