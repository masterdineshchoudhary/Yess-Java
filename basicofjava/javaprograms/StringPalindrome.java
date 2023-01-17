package javaprograms;

public class StringPalindrome {
    public static void main(String[] args) {
        String name = "noon";
		String rev = "";
		int length = name.length();

		for (int i=length-1; i>=0; i-- ) {
		    rev = rev + name.charAt(i);
		} 
		System.out.println(rev);
		
		System.out.println("Reverse is = " +  rev);
        if (rev.equals(name) ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
