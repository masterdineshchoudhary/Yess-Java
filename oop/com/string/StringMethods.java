package com.string;

public class StringMethods {
	public static void main(String[] args) {
		
//		m1 : public char charAt(int index)
		String string = "software";
		System.out.println(string.charAt(3));
		
//		m2 : public String concat(String s)
		String string2 = "night";
		string2 = string2.concat("sky");
		System.out.println(string2);
		
//		m3 : public boolean equals(Object o)
//		m4 : public boolean equalsIgnoreCase(Object o)		
		String s3 = "Java";
		System.out.println(s3.equals("Java"));
		System.out.println(s3.equals("JAVA"));
		System.out.println(s3.equalsIgnoreCase("Java"));
		System.out.println(s3.equalsIgnoreCase("JAVA"));
		
//		m5 : public String subString(int begin)
//		m6 : public String subString(int begin, int end)
		String s4 = "abcdefgh";
		System.out.println(s4.substring(3));
		System.out.println(s4.substring(2,7));
		
//		m7 : public int length()
		System.out.println(s4.length());
		
	}
}
