package course35;

public class player {

	int hp;
	int atk;

	public player(int hp, int atk) {
		super();
		this.hp = 100;
		this.atk = 70;
	}

	public int attack() {
		System.out.println("攻撃します");
		return atk;
	}

	public int action() {
		return this.attack();
	}

}

class SwordFighter extends player {
	public SwordFighter(int hp, int atk) {
		super.;
	}

	int StrongAttack() {
		System.out.println("強攻撃!!");
		return atk * 3;
	}
}
