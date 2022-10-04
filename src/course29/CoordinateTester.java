package course29;

public class CoordinateTester {
	double x;
	double y;

	public static void main(String[] args) {
		//① Coordinateクラスのインスタンスの作成
		CoordinateTester cor = new CoordinateTester();

		//② インスタンスのメンバ変数xに3.0, yに4.0を代入
		cor.setX(3.0);
		cor.setY(4.0);

		//③代入した内容を画面に表示
		System.out.println(cor.getX());
		System.out.println(cor.getY());
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
