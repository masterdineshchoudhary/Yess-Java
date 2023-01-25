package overriding;

public class Bike extends Vehicle {
	public void run() {
		System.out.println("Bike is running");
	}
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		Vehicle vehicle = new Vehicle();
		vehicle.run();
		Vehicle vehicle2 = new Bike();
		vehicle2.run();
	}
}
