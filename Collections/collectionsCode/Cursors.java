package collectionsCode;

import java.util.Enumeration;
import java.util.Vector;

// if we want to retireve obj one by one
//3 types -> Enumeration, ListIterator, Iterator
// enumeration is used to get objects one by one from legacy Collection object
// we can create Enumeration object by using elements() method of Vector Class
// Enumeration e = V.elements (V->Vector object)
// enumeration has 2 methods -> hasMoreElements(), nextElement()
// limitations of enumeration:
// only app for legacy class, hence, it is not a universal cursor
// we can set only read access and we can't perform remove operation 
// to overcome above limitations Iterator is used
// it is a universal cursor


public class Cursors {
	public static void main(String[] args) {
		Vector vector = new Vector();
		for (int i = 0; i <= 10; i++) {
			vector.addElement(i);
		}
		Enumeration enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			Integer I = (Integer)enumeration.nextElement();
			if (I%2==0) {
				System.out.println(I);
			}
		}
		
	}

}
