package course38;

public class RON extends Player {

	public RON(int hp, int mp) {
		super(hp, mp);
		this.name = "あかさか";
	}

	@Override
	public int action() {
		if (this.getHp() >= 200) {
			return this.strongAttack();
		} else if (this.getMp() >= 5) {
			return this.magic();
		}
		if (this.getHp() >= 60) {
			return this.strongAttack();
		} else {
			return this.weakAttack();
		}
	}
}
