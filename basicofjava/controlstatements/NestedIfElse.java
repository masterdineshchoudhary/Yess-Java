package controlstatements;

public class NestedIfElse {
    public static void main(String[] args) {

        // eaxmple-1
//        int age=29;
//        if (age==18 || age==19) {
//            if (age==18) {
//                System.out.println("He is 18");
//            } else if (age==19) {
//                System.out.println("He is 19");
//            }
//        }
//        else {
//            System.out.println("He is not 18 nor 19");
//        }

        // example-2
        int a=10, b=20, c= 30;
        if (a>b && a>c) {
            if (a>b) {
                System.out.println("a is greater");
            } else {
                System.out.println("b is greater");
            }
        } else if (b>c) {
            if (b>c) {
                System.out.println("b is greater");
            } else {
                System.out.println("c is greater");
            }
        } else if (a==b || b==c || a==c) {
            if (a==b) {
                System.out.println("a is equal b");
            }
            else if (b==c) {
                System.out.println("a is equal b");
            }
            else if (a==c) {
                System.out.println("a is equal b");
            }
        }
        else {
            System.out.println("No Result");
        }
    }
}
