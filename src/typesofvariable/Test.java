package typesofvariable;

public class Test {
	static int x = 20;
	int y = 10;
	public static void main(String[] args) {
		
		Test test1 = new Test();
		test1.x = 888;
		test1.y = 999;
		System.out.println(test1.x+"  -  "+test1.y);
		
		
		Test test2 = new Test();
		test2.x = 555;
		test2.y = 190;
		System.out.println(test2.x+ "  -  "+test2.y);
		
		
		Test test3 = new Test();
		test3.x = 777;
		System.out.println(test3.x+ "  -  "+test3.y);
		
		
		Test test4 = new Test();
		System.out.println(test4.x+ "  -  "+test4.y);
		
	}
}
