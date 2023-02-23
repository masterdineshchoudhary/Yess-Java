package innerclass;

public class Test5 {
	public static void main(String[] args) {
		Car car = new Car() {
			@Override
			public void run() {
				System.out.println("running safely");
			}
		};
		car.run();
		System.out.println(car.xx);
	}
}
