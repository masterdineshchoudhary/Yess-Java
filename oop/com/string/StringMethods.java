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
		
		String[] s = {"A", "AA", "AAA"};
		System.out.println(s.length);
		System.out.println(s[1].length());
		
//		m8 : public String replace(char old ch, char new ch)
		String s5 = "abcde";
		System.out.println(s5.replace("a", "j"));
		
//		m9 : public String toLowerCase()
//		m10 : public String toUpperCase()
		String s6 = "beautiful";
		String s7 = "GREAT";
		System.out.println(s6.toUpperCase());
		System.out.println(s7.toLowerCase());
		
//		m11 : public String trim();
		String s8 = " Hello World ";
		System.out.println(s8.trim());
		System.out.println(s8.replaceAll(" ",""));
		
//		m12 : public int jindexOf(char ch) - returns index of first occ of char
		String s9 = "ababa";
		System.out.println(s9.indexOf("a"));
		System.out.println(s9.lastIndexOf("a"));
		
	}
}
