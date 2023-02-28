package file;

import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("mno.txt");
			fw.write("dinesh-new-folder");
			char[] ch = {'a','b','c','d','e'};
			fw.write("\n");
			fw.write(ch);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
