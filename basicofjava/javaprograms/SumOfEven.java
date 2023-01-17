package javaprograms;

public class SumOfEven {
    public static void main(String[] args) {
        int number = 6;
		int sum=0;
		for (int i=0; i<=number ; i++) {
		    if (i%2==0) {
		        sum = sum+i;
		    } 
		}
		System.out.print(sum);
    }
}