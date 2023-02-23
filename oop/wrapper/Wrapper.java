package wrapper;

// wrapper class is a class whose object wraps or contains primitive data types
// main objective of wrapper classes are to wrap primitives into object form so that we can handle primitives also just like objects
// Object -> Number[], String, StringBuffer, StringBuilder, Boolean, Character
// WrapperClass -> [Byte, Short, Integer, Long, Float, Double, Boolean, Character]
// Constructor -> Almost all wrapper class contains 2 types of constructor 
// 1. one can take primitive as argument
// 2. other can take string as argument (if string arg not rep a num then we will get runtime exception -> NumberFormatException

// Float contains 3 types of constructor
// Flaot f = new Float(10.5f);
// Flaot f = new Float(10.5);
// Flaot f = new Float("10.5");
// Flaot f = new Float("10.5f");

// Character contains 1 constructor
// Character c = new Character('a');
// Character c = new Character("a"); -> "" will give error

// Boolean contains 2 constructor 
// 1. primitive boolean as arguments
// 2. string as arguments
// if the arg primitive boolean then the only allowed values are true & false wherein case and content both are imp
// if arg is string then content and case are not imp
// Boolean b = new Boolean(true);
// Boolean b = new Boolean(True); -> error
// Boolean b = new Boolean("true");
// Boolean b = new Boolean("True"); 
// Boolean b = new Boolean("Java");

// In all wrapper classes two string method is overridden to return content directly, and equals() is overridden for content comparison

// methods:
// 1. ValueOf()  -> is used to create wrapper object for the given Primitive of String
// 2. xxxValue() -> methods to get the primitive for the given Wrapper Object
// 3. parseXXX() -> it is static mtd and it is used to get primitive data type from given string
// 4. toString() -> wrapper object or primitives into string

public class Wrapper {
	public static void main(String[] args) {
		
		// valueOf() method
		Integer integer = Integer.valueOf("10");
		System.out.println(integer);
		
		// deprecated from java 9
		Integer integer2 = new Integer("25");
		System.out.println(integer2);
		
		// XXXvalue() method
//		Integer i = new Integer("120");
		Integer i = Integer.valueOf("130");
		System.out.println(i.byteValue());
		System.out.println(i.shortValue());
		System.out.println(i.intValue());
		System.out.println(i.longValue());
		System.out.println(i.floatValue());
		System.out.println(i.doubleValue());
		
		// parseXXX() method
		int ii = Integer.parseInt("20");
		double dd = Double.parseDouble("20.7");
		boolean bb = Boolean.parseBoolean("true");
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(bb);
		
		// toString() method // public String toString();
//		Integer inte = new Integer(10);
		Integer inte = Integer.valueOf(10);
		String string = inte.toString();
		System.out.println(string);
		System.out.println(inte.getClass().getName());
		System.out.println(string.getClass().getName());
		
//		Character character = new Character('a');
		Character character = Character.valueOf('a');
		String string2 = character.toString();
		System.out.println(string2);
		System.out.println(character.getClass().getName());
		System.out.println(string2.getClass().getName());
		
		// public static String toString(primitive p);
		String s1 = Integer.toString(10);
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		String s2 = Boolean.toString(true);
		System.out.println(s2);
		System.out.println(s2.getClass().getName());
		String s3 = Character.toString('a');
		System.out.println(s3);
		System.out.println(s3.getClass().getName());
		
		
	
	}
}
