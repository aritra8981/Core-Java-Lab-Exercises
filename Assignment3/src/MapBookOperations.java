import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapBookOperations {
    public static void main(String[] args) {
        Map<Integer, Book> bookMap = new HashMap<>(); // Map to store books with integer keys
        Scanner scanner = new Scanner(System.in);

        // Create 5 objects of the Book class
        Book book1 = new Book("Java Programming", 499.99, "James Goslin", "978-0123456789", "ABC Publications");
        Book book2 = new Book("Python Basics", 349.99, "Fletcher", "978-9876543210", "XYZ Books");
        Book book3 = new Book("Web Development", 599.99, "Jon Duckett", "978-1234567890", "ABC Publications");
        Book book4 = new Book("Database Management", 699.99, "Abraham Silberschatz", "978-0987654321", "PQR Publishing");
        Book book5 = new Book("Data Structures", 399.99, "Thomas H. Cormen", "978-5678901234", "XYZ Books");

        // Add all the objects to the Map with integer keys
        bookMap.put(1, book1);
        bookMap.put(2, book2);
        bookMap.put(3, book3);
        bookMap.put(4, book4);
        bookMap.put(5, book5);

        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayAllBooks(bookMap);
                    break;
                case 2:
                    displayBookByKey(bookMap, scanner);
                    break;
                case 3:
                    reducePrice(bookMap, scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Display the menu options
    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Display all books");
        System.out.println("2. Display book by key");
        System.out.println("3. Reduce price for a particular publication");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    // Display all books in the map
    private static void displayAllBooks(Map<Integer, Book> bookMap) {
        System.out.println("\nAll books:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }

    // Display a book based on user input key
    private static void displayBookByKey(Map<Integer, Book> bookMap, Scanner scanner) {
        System.out.print("\nEnter the key: ");
        int key = scanner.nextInt();
        if (bookMap.containsKey(key)) {
            System.out.println(bookMap.get(key));
        } else {
            System.out.println("Book with key " + key + " not found.");
        }
    }

    // Reduce the price for books from a particular publication
    private static void reducePrice(Map<Integer, Book> bookMap, Scanner scanner) {
        System.out.print("\nEnter the publication: ");
        scanner.nextLine(); // Consume newline character
        String publication = scanner.nextLine();
        double discount = 0.9; // 10% discount

        System.out.println("\nBooks with reduced price:");
        for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
            Book book = entry.getValue();
            if (book.publication.equalsIgnoreCase(publication)) {
                book.price *= discount; // Apply the discount
                System.out.println("Key: " + entry.getKey() + ", Value: " + book);
            }
        }
    }
}
