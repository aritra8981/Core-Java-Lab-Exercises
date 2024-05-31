import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println(s);

		Integer ele = s.push(60);
		System.out.println(ele);
		System.out.println(s);

		Integer ele1 = s.pop();
		System.out.println(ele1);
		System.out.println(s);

		for (Integer n : s) {
			System.out.println(n);
		}

	}
}