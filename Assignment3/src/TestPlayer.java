import java.util.ArrayList;

public class TestPlayer {

	public static void main(String[] args) {

		PlayerManagement pm = new PlayerManagement();
		ArrayList<Player> p = pm.createPlayer();

		int choice;
		char flag;

		while (true) {
			choice = pm.menu();
			switch (choice) {
				case 1:
					ArrayList<Player> p1 = pm.createPlayer();
					break;
				case 2:
					pm.displayObject(p);
				case 3:
					pm.displayPlayer(p);
				case 4:

			}
		}

	}

}
