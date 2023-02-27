package file;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("mno.txt");
		System.out.println(f.exists());
		try {
			f.createNewFile();
			System.out.println(f.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f2 = new File("dinesh-new-folder");
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.exists());
		
		File f3 = new File("C:\\Users\\dines\\eclipse-workspace\\new-dinesh-file");
		System.out.println(f3.exists());
		f3.mkdir();
		System.out.println(f3.exists());
		
		// creating file in the specified directory
		File f4 = new File("dinesh-new-folder","jkl.txt");
		System.out.println(f4.exists());
		try {
			f4.createNewFile();
			System.out.println(f4.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// boolean isFile() return true if the specified file object is pointing 
		int count =0;
		File f5 = new File("dinesh-new-folder");
		String[] s = f5.list();
//		System.out.println(f5.list());
		
//		for(String s1 : s) {
//			count++;
//			System.out.println(s1);
//		}
//		System.out.println("total no of files : "+count);
		
		for(String s1 : s) {
			File f6 = new File(f5, s1);
			if (f6.isFile()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("total no of files : "+count);
		
		
		File f7 = new File("dinesh-new-folder");
		if (f7.exists()) {
			System.out.println(f7.exists());
			System.out.println("name of the file : " + f7.getName());
			System.out.println("absolute path of the file : " + f7.getAbsolutePath());
			System.out.println("file is writable or not " + f7.canWrite());
			System.out.println("file is readable or not " + f7.canRead());
			System.out.println("file length in bytes " + f7.length());
		} else {
			System.out.println("file don't exists");
		}

		
	}
}
