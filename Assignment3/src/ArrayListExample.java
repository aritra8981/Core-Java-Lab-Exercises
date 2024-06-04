import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		// Create an ArrayList of Integer type
		ArrayList<Integer> al = new ArrayList<>();

		// Add elements to the ArrayList
		al.add(24);
		al.add(14);
		al.add(52);
		al.add(11);
		al.add(34);

		// Display the ArrayList using an iterator
		System.out.println("Displaying Array");
		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Remove an element from the ArrayList
		System.out.println("After Deleting");
		int pos = al.indexOf(52); // Find the position of the element to be removed
		al.remove(pos); // Remove the element at the found position
		System.out.println(al);

		// Update the first element of the ArrayList
		System.out.println("After Update");
		al.set(0, 55);
		System.out.println(al);

		// Retrieve an element from the ArrayList
		int a = al.get(3); // Get the element at index 3
		System.out.println(a);

		// Sort the ArrayList
		System.out.println("After Sorting: ");
		Collections.sort(al); // Sort the ArrayList in ascending order
		System.out.println(al);
	}
}
