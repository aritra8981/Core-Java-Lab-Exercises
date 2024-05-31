import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PlayerManagement {

	public int menu() {
		
		int choice;
		System.out.println("What Task you want to Perform: ");
		System.out.println("Press 1. To Fill Player Details. ");
		System.out.println("Press 2. To Display Player Details. ");
		System.out.println("Press 3. To Display Player Details who have maximum number of runs. ");
		System.out.println("Press 4. To Sort the players by name. ");
		System.out.println("Press 5. To remove Player Details who has scored less than 100 runs . ");
		System.out.println("Press 6. To Update Category. ");
		System.out.println("Press 7. Exit");

		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		return choice;

	}

	ArrayList<Player> createPlayer() {
		ArrayList<Player> al = new ArrayList<>();

		Player p1 = new Player("Rohit Sharma", 9460, 10, 113, "India", 20, 'A');
		Player p2 = new Player("Shubman Gill", 5467, 21, 5, "India", 0, 'B');
		Player p3 = new Player("Virat Kohli", 78945, 10, 12, "India", 0, 'A');
		Player p4 = new Player("Sikhar Dhawan", 56482, 62, 14, "India", 0, 'B');
		Player p5 = new Player("Ab Devilliars", 5467, 25, 27, "South Africa", 0, 'B');

		System.out.println("Players Are Ready.....!");

		return al;

	}

	void addPlayer(ArrayList<Player> al) {
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
	}
	

	// Display

	void displayObject(ArrayList<Player> al) {
		for (Player obj : al) {
			obj.display();
			System.out.println("");
		}
	}

	void displayPlayer(ArrayList<Player> al) {
		int pos = 0;
		for (Player obj : al) {
			if (obj.run > 10000) {
				pos = al.indexOf(obj);
				obj.display();
				System.out.println("");
			}
		}
	}

	void updatePlayer(ArrayList<Player> al) {
		for (Player obj : al) {
			if (obj.noOfCentury >= 10) {
				obj.category = 'A';
			} else {
				obj.category = 'B';
			}
		}
	}

	void deletePlayer(ArrayList<Player> al) {
		int pos = 0;
		for (Player obj : al) {
			if (obj.run > 100) {
				pos = al.indexOf(obj);

			}
			al.remove(pos);
		}
	}

	void sortByName(ArrayList<Player> al) {
		SortByName s = new SortByName();
		Collections.sort(al, s);
	}
}
