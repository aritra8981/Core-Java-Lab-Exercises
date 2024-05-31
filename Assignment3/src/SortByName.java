import java.util.Comparator;

public class SortByName implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		return p1.name.compareTo(p2.name);
	}
}
