
public class PlayerMain {

	public static void main(String[] args) {

		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		Player p5 = new Player();

		p1.readDetails();
		p2.readDetails();
		p3.readDetails();
		p4.readDetails();
		p5.readDetails();

		p1.checkRun();
		p2.checkRun();
		p3.checkRun();
		p4.checkRun();
		p5.checkRun();
	}

}
