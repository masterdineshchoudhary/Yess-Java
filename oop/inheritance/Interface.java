package inheritance;

class Nature {
	public void natureElement() {
		System.out.println("Creature is part of Nature");
	}
}

interface AnimalEat {
	void eat();
}

interface AnimalTravel {
	void travel();
}

class Creature extends Nature implements AnimalEat, AnimalTravel {
	@Override
	public void eat() {
		System.out.println("Animal is eating");
	}
	@Override
	public void travel() {
		System.out.println("Animal is Travelling");
	}
}

public class Interface {
	public static void main(String[] args) {
		Creature animal = new Creature();
		animal.natureElement();
		animal.eat();
		animal.travel();
	}
}
