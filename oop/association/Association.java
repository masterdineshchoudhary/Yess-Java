package association;
// Association (HAS-A Relationship) - Code Re-usability - implemented using new keyword / operator.
// Types - Aggregation(Loose Coupling) , Composition (Tight Coupling)
// Composition - 
// without containing container obj id there is no chance of existing of contained obj then both are tightly assocaited
// university has dept - dept is tightly coupled with uni
// contained object h


class Bike {
	public void start() {
		System.out.println("Bike Engine");
	}
}

class Activa {
	public void activaStart() {
		Bike engine = new Bike();
		engine.start();
	}
	public void activaColour() {
		System.out.println("Blue");
	}
}

public class Association {
	public static void main(String[] args) {
		Activa activa = new Activa();
		activa.activaStart();
		activa.activaColour();
	}
}
