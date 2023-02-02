package overriding;

public class InstanceBlock {
	static int count = 0;
	{
		count++;
	}
	
	InstanceBlock() {
		System.out.println("no-arg constructor");
	}
	InstanceBlock(int i) {
		System.out.println("int-arg constructor");
	}
	InstanceBlock(double d) {
		System.out.println("double-arg constructor");
	}
	
	public static void main(String[] args) {
		InstanceBlock instanceBlock;
		instanceBlock = new InstanceBlock();
		instanceBlock = new InstanceBlock(5);
		instanceBlock = new InstanceBlock(3.5);
		System.out.println("Total no of count is : " + count);
	}
}
