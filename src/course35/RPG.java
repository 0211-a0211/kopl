package course35;

public class RPG {

	public static void main(String[] args) {
		player player = new player(100, 70);
		player.action();
		System.out.println(player.atk);
	}

}
