public class Main {
	public static void main(String[] args) {
		Team team1 = new Team("De uovervindelige");
		team1.setRank(3);
		team1.addPlayer("Muslera");
		team1.addPlayer("Baris");
		team1.addPlayer("Icardi");
		System.out.println(team1);

		Team team2 = new Team ("Løverne");
		team2.setRank(1);
		team2.addPlayer("Mertens");
		team2.addPlayer("Torreira");
		System.out.println(team2);

	}
}