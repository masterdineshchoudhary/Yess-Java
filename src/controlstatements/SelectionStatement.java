// 2-1-23
// if-else
// switch


package controlstatements;

import java.util.Scanner;

public class SelectionStatement {
    public static void main(String[] args) {

        // example-1
//        int x = 10;
//        if (x==20) {
//            System.out.println("Hello");
//        } else {
//            System.out.println("Hi");
//        }

        // example-2
//        int a=10,b=20;
//        if (a<b) {
//            System.out.println("Hello");
//        } else {
//            System.out.println("Hi");
//        }

        // example-2
//        boolean a = true;
//        if (a = false) {
//            System.out.println("Helo");
//        } else {
//            System.out.println("Hi");
//        }

        // example-2.1
//        if (a == true) {
//            System.out.println("Hello");
//        } else {
//            System.out.println("Hi");
//        }

//        if (true);    // valid

        // odd even program
//        int a = 10;
//        if (a%2==0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check : ");
        num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // with user-input
//        int a;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number ");
//        a = sc.nextInt();
//        System.out.println("Number is " + a);



    }
}
