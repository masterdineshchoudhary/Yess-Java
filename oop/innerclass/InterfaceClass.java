package innerclass;

public interface InterfaceClass {
	public int getWheels();
	class DefaultVehicle implements InterfaceClass {
		public int getWheels() {
			return 2;
		}
	}
}

class MyBus implements InterfaceClass {
	@Override
	public int getWheels() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	
}
