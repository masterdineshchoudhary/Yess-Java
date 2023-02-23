package innerclass;

public class VehicleTypes {
	interface Vehicle {
		public int getNoOfWheels();
	}
	class Bus implements Vehicle {
		public int getNoOfWheels() {
			return 6;
		}
	}
	class Auto implements Vehicle {
		public int getNoOfWheels() {
			return 3;
		}
	}
	
	public static void main(String[] args) {
		VehicleTypes vehicleTypes = new VehicleTypes();
		VehicleTypes.Bus bus = vehicleTypes.new Bus();
		System.out.println(bus.getNoOfWheels());
//		System.out.println(new VehicleTypes().new Bus().getNoOfWheels());
		System.out.println(new VehicleTypes().new Auto().getNoOfWheels());
	}
}
