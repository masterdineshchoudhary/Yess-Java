package array;
import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
//		int[] arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//	 declaration, instantiation, initialization
		int[] arr = new int[] {10,20,30,40,501};

//	2d array 
		int[][] arr2 = new int[][]{{10,20,30},{40,50,60}}; 
		int[][] arr3 = {{10,20,30},{40,50,60}}; 
		int[][] arr4 = new int[2][3]; // int
		byte[][] arr5 = new byte[2][3]; // byte
		boolean[][] arr6 = new boolean[2][3]; // boolean
		char[][] arr7 = new char[2][3]; // char
//		arr4[0] = new int[2];
//		arr4[1] = new int[3];
		arr4[0][0] = 1;
		arr4[0][1] = 2;
		arr4[0][2] = 3;
		arr4[1][0] = 4;
		arr4[1][1] = 5;
		arr4[1][2] = 6;
		for(int[] x1 : arr4) {
			System.out.println();
			for (int x2 : x1) {
				System.out.print(x2+" ");
			}
		}
		
		System.out.println();
		System.out.println(arr4[0]);
		System.out.println(arr5[0]); // byte
		System.out.println(arr6[0]); // boolean
		System.out.println(arr7[0]); // char
//		System.out.println(arr8[0]); // double
		System.out.println(arr4[1]);
		System.out.println(arr4[0][0]);

		System.out.println();
//		internally toString() method gets calls
		int[] x = new int[2];
		System.out.println(x);
	
		
//		for(int[] x1 : arr2) {
//			System.out.println();
//			for (int x2 : x1) {
//				System.out.print(x2+" ");
//			}
//		}
		

//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		for (int x : arr) {
//			System.out.print(x+" ");
//			
//		}
//		System.out.println();
//		System.out.println("For Each Loop");
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}
		
		
		// 3d array
		int[][][] z =new int [2][][];
//		x[0] = new int[3][];
//		x[0][0] = new int[1];
//		int[0][1] = new int[2];
//		x[0][2] = new int[3];
	}
}
