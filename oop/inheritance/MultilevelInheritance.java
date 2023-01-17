package inheritance;

class Shape {
	public void display() {
		System.out.println("Display");
	}
}

class Area extends Shape {
	public void area() {
		System.out.println("Area");
	}
}

class Volume extends Area  {
	public void volume() {
		System.out.println("Volume");
	}
}

class Cube extends Volume {
	
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		
		System.out.println("Ans will be provided by Rectangle class");
		
//		Cube cube = new Cube();
//		cube.display();
//		cube.area();
//		cube.volume();
	}
}
