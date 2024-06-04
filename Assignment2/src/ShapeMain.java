// Main class to test polymorphism with Shape, Triangle, Rectangle, and Circle classes
public class ShapeMain extends Shape {

	public static void main(String[] args) {
		// Create instances of Shape, Triangle, Rectangle, and Circle
		Shape s = new Shape();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();

		// Invoke the draw() method of each object
		System.out.println("Drawing a generic shape:");
		s.draw(); // Invoke draw() of Shape class
		System.out.println("\nDrawing a triangle:");
		t.draw(); // Invoke overridden draw() of Triangle class
		System.out.println("\nDrawing a rectangle:");
		r.draw(); // Invoke overridden draw() of Rectangle class
		System.out.println("\nDrawing a circle:");
		c.draw(); // Invoke overridden draw() of Circle class
	}

}
