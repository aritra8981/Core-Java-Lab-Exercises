import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        // Create a new Stack instance of Integer type
        Stack<Integer> s = new Stack<>();

        // Add elements to the stack
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        // Print the stack contents
        System.out.println("Stack contents after initial additions: " + s);

        // Push an element onto the stack and retrieve the element
        Integer ele = s.push(60);
        System.out.println("Element pushed onto stack: " + ele);
        System.out.println("Stack contents after pushing 60: " + s);

        // Pop an element from the stack and retrieve the element
        Integer ele1 = s.pop();
        System.out.println("Element popped from stack: " + ele1);
        System.out.println("Stack contents after popping: " + s);

        // Iterate through the stack using enhanced for loop
        System.out.println("Stack contents using enhanced for loop:");
        for (Integer n : s) {
            System.out.println(n);
        }
    }
}
