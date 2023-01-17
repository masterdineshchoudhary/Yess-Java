package javaprograms;

public class Prime {
    public static void main(String[] args) {
        // int num = 6;
		// boolean flag = false;
		// for (int i=2; i<=num/2 ; i++ ) {
		//     if (num%i==0) {
		//         flag = true;
		//         break;
		//     } 
		// } 
		// if(flag) {
		//     System.out.println("Not Prime Number");
		// } else {
		//     System.out.println("Prime Number");
		// }

        int num = 6;
	    int count=0;
		for (int i=2; i<=num-1 ; i++ ) {
		    if (num%i==0) {
		        count++;
		    } 
		} 
		if(count>0) {
		    System.out.println("Not Prime Number");
		} else {
		    System.out.println("Prime Number");
		}
    }
}
