import java.util.ArrayList;

public class Team {
	private String teamName;
	private int rank;
	private ArrayList<String> players = new ArrayList<>();

	public Team (String teamName) {
		this.teamName = teamName;
	}

	public void setRank (int rank) {
		this.rank = rank;
	}

	public void addPlayer (String playerName) {
		players.add(playerName);
	}

	public String toString() {
		String result = "Hold: " + teamName + " Rang: " + rank + "\nSpillere:\n";
		for (String player : players) {
			result += player + "\n";
		}
		return result;
	}
}