package basicprograms;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
            // System.out.printf("%d * %d = %d",number,i,(number*i));
        }
        sc.close();
    }
}