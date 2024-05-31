
public class Book {
	String name;
	float price;
	String author_name;
	int isbnNo;
	String publication;

	public Book(String name, float price, String author_name, int isbnNo, String publication) {
		this.name = name;
		this.price = price;
		this.author_name = author_name;
		this.isbnNo = isbnNo;
		this.publication = publication;
	}

	void displayBook() {
		System.out.println("Book Name: " + name);
		System.out.println("Book Price: " + price);
		System.out.println("Book Author Name: " + author_name);
		System.out.println("Book ISBN No.: " + isbnNo);
		System.out.println("Book Publication: " + publication);
	}

}
