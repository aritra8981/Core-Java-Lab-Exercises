public class Book {
    String name; // Name of the book
    double price; // Price of the book
    String authorName; // Name of the author
    String isbnNo; // ISBN number of the book
    String publication; // Publication information

    // Constructor to initialize a Book object
    public Book(String name, double price, String authorName, String isbnNo, String publication) {
        this.name = name;
        this.price = price;
        this.authorName = authorName;
        this.isbnNo = isbnNo;
        this.publication = publication;
    }

    // Overriding the toString method to provide a string representation of a Book object
    @Override
    public String toString() {
        return "[Book Name=" + name + ", price=" + price + ", Author Name=" + authorName + ", ISBN No=" + isbnNo
                + ", Publication=" + publication + "]";
    }
}
