package com.string;

import java.util.StringJoiner;

public class StringJoinerCode {
	public static void main(String[] args) {
		
		// add() method
		StringJoiner sJoiner1 = new StringJoiner(",");
		sJoiner1.add("how").add("are").add("you");
		System.out.println(sJoiner1);
		
		StringJoiner sJoiner2 = new StringJoiner("-","[","]"); // (separator, prefix, suffix)
		sJoiner2.add("Delhi").add("Pune").add("Goa");
		System.out.println(sJoiner2);
		
		// merger() method
		StringJoiner sJoiner3 = sJoiner1.merge(sJoiner2); 
		System.out.println(sJoiner3);
		
		// setEmptyValue("string")
		StringJoiner sJoiner4 = new StringJoiner(";");
		
		sJoiner4.setEmptyValue("beautiful");
		System.out.println(sJoiner4);
		System.out.println(sJoiner4.length());
		
		sJoiner4.setEmptyValue("scenery");
		System.out.println(sJoiner4);
		System.out.println(sJoiner4.length());
		
		sJoiner4.setEmptyValue("java");
		System.out.println(sJoiner4);
		System.out.println(sJoiner4.length());
		
	}
}
