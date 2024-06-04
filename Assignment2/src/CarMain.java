// Main class to test polymorphism with Car, Maruti, Alto, and Brezza classes
public class CarMain {

	public static void main(String[] args) {
		// Create an instance of Car
		Car c = new Car();

		// Create instances of Maruti, Alto, and Brezza
		Maruti m = new Maruti();
		Alto a = new Alto();
		Brezza b = new Brezza();

		// Invoke the speed() method of each object
		System.out.println("Generic Car Speed:");
		c.speed(); // Invoke speed() of Car class
		System.out.println("\nMaruti's Speed:");
		m.speed(); // Invoke overridden speed() of Maruti class
		System.out.println("\nAlto's Speed:");
		a.speed(); // Invoke overridden speed() of Alto class
		System.out.println("\nBrezza's Speed:");
		b.speed(); // Invoke overridden speed() of Brezza class
	}

}
