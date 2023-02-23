package array;

import java.util.Iterator;

public class AnonymousArray {
	public static void main(String[] args) {
		sum(new int[] {10,20,30,40,50});
	}
	public static void sum(int x[]) {
		int total = 0;
		for (int i : x) {
			total=total+i;
		}
		System.out.println("total : "+total);
	}
}
