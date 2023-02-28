package file;

import java.io.FileWriter;
import java.io.PrintWriter;

// it is the most enhanced writer to write character data to the file.
// main advantage over FileWriter and BufferedWriter is that we can write any type of primitive data to the file. 
// PrintWriter pw = new PrintWriter(String fname);
// PrintWriter pw = new PrintWriter(f);
// PrintWriter pw = new PrintWriter(writer obj);

// Methods :
//write(int ch);
//write(char []);
//write(String s);
//flush();
//close();
//println(int i);
//println(char ch);
//println(double d);
//println(boolean b);
//println(String s);
//print(int i);
//print(char ch);
//print(double d);
//print(boolean b);
//print(String s);

public class PrintWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter f4 = new FileWriter("mno.txt");
			PrintWriter pWriter = new PrintWriter(f4);
			pWriter.println(true);
			pWriter.println(10);
			pWriter.println(10.5);
			pWriter.println('a');
			pWriter.print("dinesh");
			pWriter.flush();
			pWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
