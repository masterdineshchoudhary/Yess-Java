package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SDTest {
	public static void main(String[] args) {
		SerializationDeserialization sd1 = new SerializationDeserialization("dinesh", 101);
		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("abc.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(sd1);
			System.out.println("done");
			oos.close();
			fos.close();
			
			// De-serialization
			FileInputStream fis = new FileInputStream("abc.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerializationDeserialization sd2 = (SerializationDeserialization)ois.readObject();
			System.out.println(sd2.name+" - "+sd2.id);
			System.out.println("");
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
