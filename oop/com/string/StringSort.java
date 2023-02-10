package com.string;

public class StringSort {
	public static void main(String[] args) {
		String s = "bchfage";
		char arr[] = s.toCharArray();
		char temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (char c : arr) {
			System.out.print(c);
		}
	}
}
