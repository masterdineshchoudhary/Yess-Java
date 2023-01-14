package controlstatements;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // example-1
//        int ch = 2;
//        switch (ch) {
//            case 1:
//                System.out.println("number is 1");
//                break;
//            case 2:
//                System.out.println("number is 2");
//                break;
//            case 3:
//                System.out.println("number is 3");
//                break;
//            default:
//                System.out.println("No Match");
//        }

        // example-2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string : ");
//        String str = sc.nextLine();
//        switch (str) {
//            case "Hi":
//                System.out.println("Hi");
//                break;
//            case "Hello":
//                System.out.println("Hello");
//                break;
//            case "Bye":
//                System.out.println("Bye");
//                break;
//            default:
//                System.out.println("No Match Found");
//        }




        // example-3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number from (1 to 5 any): ");
//        int num = sc.nextInt();
//        switch (num) {
//            case 1:
//                for (int i = 1; i <= num; i++) {
//                    System.out.println(num + " * " + i + " = " + (num*i));
//                }
//                break;
//            case 2:
//                for (int i = 1; i <= num; i++) {
//                    System.out.println(num + " * " + i + " = " + (num*i));
//                }
//                break;
//            case 3:
//                for (int i = 1; i <= num; i++) {
//                    System.out.println(num + " * " + i + " = " + (num*i));
//                }
//                break;
//            case 4:
//                for (int i = 1; i <= num; i++) {
//                    System.out.println(num + " * " + i + " = " + (num*i));
//                }
//                break;
//            case 5:
//                for (int i = 1; i <= num; i++) {
//                    System.out.println(num + " * " + i + " = " + (num*i));
//                }
//                break;
//            default:
//                System.out.println("No Number in Range");
//        }

        // Switch
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int n2 = sc.nextInt();
        System.out.println("Select from the Arithmetic Operators(+,-,*,/)");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                result = n1+n2;
                System.out.println(result);
                break;
            case '-':
                result = n1-n2;
                System.out.println(result);
                break;
            case '*':
                result = n1*n2;
                System.out.println(result);
                break;
            case '/':
                result = n1/n2;
                System.out.println(result);
                break;
            default:
                System.out.println("No Operations Selected");
        }
    }
}
