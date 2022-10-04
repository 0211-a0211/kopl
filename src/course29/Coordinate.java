package course29;

public class Coordinate { //この行を修正

	private double x; //この行を修正
	private double y; //この行を修正

	Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double setX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public double setY() {
		return y;
	}
}
