package course38;

public class ssss extends Player {

	public ssss(int hp, int mp) {
		super(hp, mp);
		this.name = "田中";
	}

	@Override
	public int action() {
		if (this.getHp() >= 150) {
			return this.strongAttack();
		} else if (this.getMp() > 25) {
			return this.fullPowerMagic();
		} else if (this.getMp() >= 25) {
			return this.magic();
		} else {
			return this.weakAttack();
		}
	}
}