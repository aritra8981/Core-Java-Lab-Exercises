import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain {

	public static void main(String[] args) {

		// Creating HashMap
		HashMap<Integer, Book> hm = new HashMap<>();

		// Creating Objects of Book
		Book b1 = new Book("OS", 258, "Yashwant", 13456, "Ratul Publication");
		Book b2 = new Book("C", 345, "Obera", 456782, "kiara Publication");
		Book b3 = new Book("C++", 697, "D Patil", 134865, "ritu Publication");
		Book b4 = new Book("DBMS", 872, "Jayapoovan", 42846, "nilz Publication");
		Book b5 = new Book("Python", 240, "KR Mishra", 137954, "ritu Publication");

		hm.put(b1.isbnNo, b1);
		hm.put(b2.isbnNo, b2);
		hm.put(b3.isbnNo, b3);
		hm.put(b4.isbnNo, b4);
		hm.put(b5.isbnNo, b5);

		// Iterating the objects to display
		for (Map.Entry<Integer, Book> m : hm.entrySet()) {
			System.out.println(m.getKey() + " ");
			m.getValue().displayBook();
			System.out.println(" ");
		}

		System.out.println("Enter the ISBN No. to Display the Book");
		int isbn;
		Scanner s = new Scanner(System.in);
		isbn = s.nextInt();
		Book b = hm.get(isbn);
		b.displayBook();

		// Updating the price of particular publication
		int h = s.nextInt();
		Book k = hm.get(h);
		k.price = (k.price - (0.1f * k.price));
		k.displayBook();

	}

}
