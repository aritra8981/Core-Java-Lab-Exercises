
public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setGender(char g1) {
		this.gender = g1;
	}

	public char getGender() {
		return gender;
	}

	void display() {

	}

}
