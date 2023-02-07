package oopsobject;

public class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
//		System.out.println(rollNo+" "+name);
	}
	
	// if we don't override toString();
	// object.Student@4617c264
	// object.Student@36baf30c
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Student student1 = new Student(101, "abc");
		Student student2 = new Student(202, "pqr");
		System.out.println(student1);
		System.out.println(student2);
		
		// hashCode() -> public native int hashCode() -> JVM generates uniques no for every
		// object that is called hashCode.
		// JVM uses hashCode while saving objects into hashing related DS like HashSet, HashMap, HashTable
		// adv of saving obj based on hashing is that searching becomes easy
		// using hashCode() to print hashCode of object
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		

		
	}

}
