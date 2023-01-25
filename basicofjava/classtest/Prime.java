package classtest;

public class Prime {
	public static void main(String[] args) {
		int no=7, count=0;
		for(int i=2; i<no-1; i++) {
			if (i%2==0) {
				count = count + 1;
			} 
		}
		if (count>0) {
			System.out.println("Not Prime");			
		} else {
			System.out.println("Prime");
		}
	}
}
