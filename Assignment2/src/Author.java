// Author class representing an author of a book
public class Author {
    // Private member variables to store author's information
	private String name;
    private String email;
    private char gender;

    // Constructor to initialize the name, email, and gender of the author
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getter method to retrieve the name of the author
    public String getName() {
        return name;
    }

    // Getter method to retrieve the email of the author
    public String getEmail() {
        return email;
    }

    // Getter method to retrieve the gender of the author
    public char getGender() {
        return gender;
    }
}
