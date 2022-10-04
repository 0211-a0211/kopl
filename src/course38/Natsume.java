package course38;

public class Natsume extends Player {

	public Natsume(int hp, int mp) {
		super(hp, mp);
		this.name = "なかやまきんにくん";
	}

	@Override
	public int action() {
		if (this.getHp() * 0.3 > 39) {
			return this.strongAttack();
		} else if (this.getMp() >= 25) {
			return this.fullPowerMagic();
		} else {
			return this.weakAttack();
		}

	}
}
