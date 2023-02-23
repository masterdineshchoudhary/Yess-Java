package exception;

// finally block is always associated with try-catch block and is responsible to perform cleanup activities related to try block
// i.e whatever resources is open as the part of try block will be close d inside finally block
// finalize() is responsible to perform cleanup activities related to object 
// i.e whatever resources associated with object will be deallocated before destroying an object by using finally block

// various possible combinations of try-catch-finally
// in TCF, order is important wherever we are writing try compulsory we should write either catch or finally else compiler error
// whenever we are writing 
// i.e catch without try is invalid
// whenever we are writing finally block compulsory we should write try block i.e finally without try is invalid
// inside TCF, we can declare try-catch and finally block i.e nesting of try-catch and finally is allowed
// 


public class Finally {
	public static void main(String[] args) {
		try {
			int data = 25/0;
			System.out.println(data);
//			int data2 = 24/8;
//			System.out.println(data2);
		} catch (Exception e) {
//		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			System.out.println("finally block is always exceuted");
		}
		System.out.println("Rest of the code");
		
	}
}
