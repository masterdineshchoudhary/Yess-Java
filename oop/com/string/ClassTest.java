package com.string;

public class ClassTest {
	public static void main(String[] args) {
		
		// Buffer Range : -125 to 127
		
		Integer X = new Integer(10);
		Integer Y = new Integer(10);
		System.out.println(X==Y);
		
		Integer X1 = new Integer(10);
		Integer Y1 = 10;;
		System.out.println(X1==Y1);
		
		// within buffer range as pointing to same value
		Integer X2 = 20;
		Integer Y2 = 20;
		System.out.println(X2==Y2);
		
		// within buffer range as pointing to same value
		Integer X3 = 100;
		Integer Y3 = 100;
		System.out.println(X3==Y3);
		
		// out of buffer range so new objects will be created in heap memory
		Integer X4 = 1000;
		Integer Y4 = 1000;
		System.out.println(X4==Y4);
		
		// buffer also support boolean values
		Boolean B1 = false;
		Boolean B2 = false;
		System.out.println(B1==B2);
		
		// buffer don't allow double value 
		Double D1 = 10.0;
		Double D2 = 10.0;
		System.out.println(D1==D2);
	}
}
