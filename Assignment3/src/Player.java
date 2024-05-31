
public class Player {
	String name;
	int run;
	int wicket;
	int matches;
	String country;
	int noOfCentury;
	char category;

	public Player(String name, int run, int wicket, int matches, String country, int noOfCentury, char category) {
		this.name = name;
		this.run = run;
		this.wicket = wicket;
		this.matches = matches;
		this.country = country;
		this.noOfCentury = noOfCentury;
		this.category = category;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Runs: " + run);
		System.out.println("Total Wickets: " + wicket);
		System.out.println("No. of matches: " + matches);
		System.out.println("Country Name: " + country);
		System.out.println("Total No. of Centuries: " + noOfCentury);
		System.out.println("Player Category: " + category);
	}

}
