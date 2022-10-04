package course18;

// ２次元配列を生成して全要素を乱数で埋めつくす

import java.util.Random;

class 例題３ {

	public static void main(String[] args) {
		Random rand = new Random();

		int[][] x = new int[3][4];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				x[i][j] = (i + 1) * (j + 1);
				System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
			}
		}
	}
}