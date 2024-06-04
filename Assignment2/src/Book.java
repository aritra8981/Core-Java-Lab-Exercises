// Book class representing a book written by an author
public class Book {
    // Private member variables to store book information
	private String name;
    private Author author;
    private double price;
    private int qty;

    // Constructor to initialize the name, author, price, and quantity of the book
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter method to retrieve the name of the book
    public String getName() {
        return name;
    }

    // Getter method to retrieve the author of the book
    public Author getAuthor() {
        return author;
    }

    // Getter method to retrieve the price of the book
    public double getPrice() {
        return price;
    }

    // Setter method to set the price of the book
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method to retrieve the quantity of the book
    public int getQty() {
        return qty;
    }

    // Setter method to set the quantity of the book
    public void setQty(int qty) {
        this.qty = qty;
    }
}
