package fa.darts.data;

import java.util.ArrayList;
import java.util.List;

public class DartsData {

	private static List<Player> players = new ArrayList<Player>();
	
	
	public static void resetPlayers() {
		players.clear();
	}
	
	public static void addPlayer(Player player) {
		players.add(player);
	}
	
	public static Player getPlayer(int index) {
		return players.get(index);
	}
	
	public static boolean isEmpty() {
		return players.isEmpty();
	}
	
}
