import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        // Create a LinkedList of Integer type
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements to the linked list
        ll.add(101);
        ll.add(102);
        ll.add(103);
        ll.add(104);
        ll.add(105);
        ll.add(106);

        // Display the initial linked list
        System.out.println("Initial List: " + ll);

        // Insert an element at the beginning of the linked list
        ll.addFirst(100);
        System.out.println("After adding at the beginning: " + ll);

        // Insert an element at a specific position in the linked list
        ll.add(5, 205);
        System.out.println("After inserting at position 5: " + ll);

        // Insert an element after a given node in the linked list
        ll.add(6, 206);
        System.out.println("After inserting after position 5: " + ll);

        // Remove the first element from the linked list
        ll.removeFirst();
        System.out.println("After deleting from the beginning: " + ll);

        // Remove an element at a specific position from the linked list
        ll.remove(3);
        System.out.println("After deleting from position 3: " + ll);
    }
}
