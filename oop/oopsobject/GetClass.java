package oopsobject;
import java.lang.reflect.Method;

// getClass() method is used to get runtime class definition if an object
// Public class getClass();
// this object is used to get class level info such as variables, methods info, etc

public class GetClass {
	public static void main(String[] args) {
		int count = 0;
//		Object object = new Object();
		Object object = new String();
		Class c = object.getClass();
		
		System.out.println("Fully qualified name : "+c.getName());
		
		Method [] m = c.getDeclaredMethods();
		System.out.println("methods information : ");
		for(Method m1:m) {
			count++;
			System.out.println(m1);
		}
		
		System.out.println("Total number of methods = " + count);
		
	}
}
