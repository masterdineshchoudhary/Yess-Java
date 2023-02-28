package file;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("mno.txt");
			try {
				int i=fr.read();
				while (i!=-1) {
					System.out.println((char)i);
					i = fr.read();
				}
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
