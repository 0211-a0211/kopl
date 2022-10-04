package course02;
// 0～9のラッキーナンバーを乱数で生成して表示

import java.util.Random;

class enshu8 {

	public static void main(String[] args) {
		Random rand = new Random();
		int height = rand.nextInt(41);
		Random rand1 = new Random();
		int width = rand.nextInt(41);
		System.out.println("整数１：" + height);
		System.out.println("整数２:" + width);
		System.out.println(height * width);

	}
}
