import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		// Creating Array List
		al.add(24);
		al.add(14);
		al.add(52);
		al.add(11);
		al.add(34);

		// Display Array List
		System.out.println("Displaying Array");
		Iterator it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Update Array List
		System.out.println("After Update");
		al.set(0, 55);

		for (Integer element : al) {
			System.out.println(element);
		}

		// Deleting
		System.out.println("After Deleting");
		int pos = al.indexOf(52);
		al.remove(pos);
		for (Integer ele : al) {
			System.out.println(ele);
		}

		int a = al.get(3);
		System.out.println(a);

		System.out.println("After Sorting: ");
		Collections.sort(al);
		for (Integer ele : al) {
			System.out.println(ele);
		}

	}
}
