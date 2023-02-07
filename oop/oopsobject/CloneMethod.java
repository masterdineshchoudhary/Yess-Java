package oopsobject;

public class CloneMethod implements Cloneable {
	int roll;
	String name2;
	
	public CloneMethod(int roll, String name2) {
		super();
		this.roll = roll;
		this.name2 = name2;
	}
	
	public static void main(String[] args) {
		try {
			CloneMethod s1 = new CloneMethod(101, "Amit");
			CloneMethod s2 = (CloneMethod)s1.clone();
			System.out.println(s1.roll + " - "+s1.name2);
			System.out.println(s2.roll + " - "+s2.name2);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
