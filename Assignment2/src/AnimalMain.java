public class AnimalMain {

	public static void main(String[] args) {
		// Create an instance of Animal
		Animal animals = new Animal();

		// Create instances of Dog and Cat
		Dog d = new Dog();
		Cat c = new Cat();

		// Make sounds of the animals
		System.out.println("Sound of generic animal:");
		animals.makeSound(); // Invoke makeSound() of Animal class
		System.out.println("\nSound of a dog:");
		d.makeSound(); // Invoke overridden makeSound() of Dog class
		System.out.println("\nSound of a cat:");
		c.makeSound(); // Invoke overridden makeSound() of Cat class
	}
}
