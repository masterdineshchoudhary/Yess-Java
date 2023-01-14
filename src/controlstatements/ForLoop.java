package controlstatements;

public class ForLoop {
    public static void main(String[] args) {

        // Ascending Order
//        for(int i=10; i>0; i--) {
//            System.out.println(i);
//        }

        // Descending Order
//        for(int i=10; i>0; i--) {
//            System.out.println(i);
//        }

        // Wrong Statements
        // case:1   o/p = unreachable
//        for (int i = 0; true ; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Hi");

        // case:2   o/p = unreachable
//        for (int i = 0; false ; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Hi");

        // case:3  o/p = Infinite Hello loop
//        int a=10, b=20;
//        for (int i = 0; a<b ; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Hi");

        // case:4  o/p = Hi
//        int a=10, b=20;
//        for (int i = 0; a>b ; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Hi");

        // case:5  o/p = Hi
//        final int a=10, b=20;
//        for (int i = 0; a<b ; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Hi");

        // case:6  o/p = Hi
//        final int a=10, b=20;
//        for (int i = 0; a>b ; i++) {
//            System.out.println("Hello");
//        }
//        System.out.println("Hi");

        // odd even using for loop
        System.out.println("Even Numbers : ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(2*i+" ");
        }
//        System.out.println();
//        System.out.println("Odd Numbers : ");
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(2*i+1);
//        }

//        System.out.println("Even Numbers : ");
//        for (int i = 0; i <= 10; i = i+2) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println("Odd Numbers : ");
//        for (int i = 1; i <= 10; i = i+2) {
//            System.out.print(i+" ");
//        }

    }
}
