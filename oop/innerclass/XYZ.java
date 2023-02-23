package innerclass;

//public interface OuterInterface {
//	public void m5();
//	interface InnerInterface {
//		public void m6();
//	}
//}

class XYZ implements OuterInterface, OuterInterface.InnerInterface { 

	@Override
	public void m5() {
		System.out.println("Outer Interface method Implementation");
	}

	@Override
	public void m6() {
		System.out.println("Inner Interface method Implementation");
	}
	
	public static void main(String[] args) {
		XYZ xyz = new XYZ();
		xyz.m5();
		xyz.m6();
	}
}
