package javaprograms;

public class Palindrome {
    public static void main(String[] args) {
        int number = 101, temp = number, rev = 0, rem;
        while (number>0) {
            rem = number % 10;
            rev = rev*10 + rem;
            number = number / 10;
        }
        System.out.println("Reverse is = " +  rev);
        if (temp == rev ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}