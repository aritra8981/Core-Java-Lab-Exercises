public class PlayerMain {

	public static void main(String[] args) {
		// Create instances of the Player class
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();

		// Read details for each player
		p1.readDetails();
		p2.readDetails();
		p3.readDetails();
		p4.readDetails();
		p5.readDetails();

		// Check runs and display details if applicable for each player
		p1.checkRun();
		p2.checkRun();
		p3.checkRun();
		p4.checkRun();
		p5.checkRun();
	}
}
