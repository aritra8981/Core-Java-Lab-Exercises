public class AuthorMain {
    public static void main(String[] args) {
        // Create an author
        Author author = new Author("John Doe", "john@example.com", 'm');

        // Create a book
        Book book = new Book("Java Programming", author, 560, 100);

        // Display book information
        System.out.println("Book Name: " + book.getName());
        System.out.println("Author Name: " + book.getAuthor().getName());
        System.out.println("Author Email: " + book.getAuthor().getEmail());
        System.out.println("Author Gender: " + book.getAuthor().getGender());
        System.out.println("Price: Rs" + book.getPrice());
        System.out.println("Quantity Available: " + book.getQty());

        // Update book price and quantity
        book.setPrice(630);
        book.setQty(50);

        // Display updated book information
        System.out.println("\nUpdated Price: Rs" + book.getPrice());
        System.out.println("Updated Quantity Available: " + book.getQty());
    }
}
