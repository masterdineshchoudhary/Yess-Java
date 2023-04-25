package serialization;

import java.io.Serializable;

// it is a process of writing
// in other words, serialization is a process of converting the object from java supported file into
// Serialization -> FileOutputStream, ObjectOutputStream
// DeSerialization -> FileInputStream, ObjectInputStream

public class SerializationDeserialization implements Serializable {
	String name;
//	int id;
	transient int id;
	
	public SerializationDeserialization(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}
