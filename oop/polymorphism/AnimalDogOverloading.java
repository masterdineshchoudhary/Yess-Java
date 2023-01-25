package polymorphism;


class Animal {
	public void a1(Animal a) {
		System.out.println("Animal-version");
	}
}

class AnimalDogOverloading extends Animal {
	public void a1(AnimalDogOverloading d) {
		System.out.println("Dog-version");
	}


	public static void main(String[] args) {
		Animal a = new Animal();
		a.a1(a);
		AnimalDogOverloading ado = new AnimalDogOverloading();
		ado.a1(ado);
		Animal animal = new AnimalDogOverloading();
		animal.a1(animal);
		animal.a1(ado);
		animal.a1(a);
	}
}
