import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(101);
		ll.add(102);
		ll.add(103);
		ll.add(104);
		ll.add(105);
		ll.add(106);

		// Display
		System.out.println(ll);

		// insert at beginning
		ll.add(0, 100);
		System.out.println(ll);

		// insert at a given position
		ll.add(5, 205);
		System.out.println(ll);

		// insert after a given node
		ll.add(5 + 1, 205);
		System.out.println(ll);

		// delete at the beginning
		ll.pop();
		System.out.println(ll);

		// delete at a given position
		ll.remove(3);
		System.out.println(ll);

	}

}