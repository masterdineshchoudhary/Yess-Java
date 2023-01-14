package oops;

class Animal {
	public void eat() {
		System.out.println("Animal");
	}
}

class Dog extends Animal {
	public void dogName() {
		System.out.println("Dog");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		
		// Dog reference - dog object of Dog() - can access both Parent(Animal) and Child(Dog) class data
		Dog dog = new Dog();
		dog.eat();
		dog.dogName();
		
//		NOT POSSIBLE - Dog reference object of Animal class
//		Dog dog2 = new Animal();
		
		// Animal reference - animal object of Dog() - can access only Animal class data
		Animal animal = new Dog();
		animal.eat();
		
		// Animal reference - animal object of Animal() - can access only Animal class data
		Animal animal2 = new Animal();
		animal2.eat();
		
		
	}
}
