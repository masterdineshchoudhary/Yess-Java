package com.string;

public class StringBufferCode {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java");
		sb1.append(" langauge");
		System.out.println(sb1);
		
		
		StringBuffer sb2 = new StringBuffer("abcd");
		System.out.println(sb2.capacity());
//		sb2 = sb2.append("abcdefghijk");
//		System.out.println(sb2.capacity());
//		sb2 = sb2.append("q");
//		System.out.println(sb2.capacity());
		
		// Buffer methods
		
		StringBuffer sb3 = new StringBuffer("hello");
//		public int length();
		System.out.println(sb3.length());
		
//		public int capacity();
		System.out.println(sb3.capacity());
		
//		public char charAt(int index); -> retrieve using index
		System.out.println(sb3.charAt(2));
		
//		public void setCharAt(int index, new char ch); - > replace
		sb3.setCharAt(3, 'x');
		System.out.println(sb3);
		
//		public StringBuffer append(String s); -> add at behind
		sb3.append("pq");
		System.out.println(sb3);
		
//		public StringBuffer insert(int index, String s); -> add in between
		sb3.insert(3, "hi");
		System.out.println(sb3);
		
//		public StringBuffer delete(int begin, int end); -> deletes part
		sb3.delete(3, 6);
		System.out.println(sb3);
		
//		public StringBuffer deleteCharAt(int index); -> deletes one char
		sb3.deleteCharAt(2);
		System.out.println(sb3);
		
//		public StringBuffer reverse(); -> reverses
		System.out.println(sb3.reverse());
		
//		public StringBuffer setLength(int length); 
		StringBuffer sb4 = new StringBuffer("software");
		sb4.setLength(5);
		System.out.println(sb4);
		
//		public void trimSize(); -> extra capacity is trimed
		StringBuffer sb5 = new StringBuffer(1000);
		sb5.append("abc");
		System.out.println(sb5.capacity());
		sb5.trimToSize();
		System.out.println(sb5);
		
		
		
		
	}
	
}
