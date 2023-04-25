package collectionsCode;

import java.util.Vector;

// it's implementations is based on dynamic array
// null insertion is possible
// heterogeneous elements are allowed
// duplicates are allowed
// insertion order is preserved
// it implements serializable, cloneable and RandomAccessInterface
// empty vector object will be created with default initial capacity of 10
// once it reaches its max capacity a new vector object is created with new capacity
// vector -> new cap = current cap * 2;
// ArrayList -> new cap = (current cap *3/2 ) +2



// methods -> 
// addElement(Object o)
// removeElement(Object o)
// removeElementAt(int index)
// removeALLElements()
// object elementAt(int index)
// object firstElement()
// object LastElement()
// Enumeration
// int size()
// int capacity()

public class VectorCode {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.size());
		v.addElement("a");
		System.out.println(v.capacity());
		System.out.println(v);
		
	}
}