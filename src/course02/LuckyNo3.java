package course02;
// 0～9のラッキーナンバーを乱数で生成して表示

import java.util.Random;

class LuckyNo3 {

	public static void main(String[] args) {
		Random rand = new Random();

		int lucky1 = rand.nextInt(31); // 0～9の乱数
		int lucky2 = rand.nextInt(31);
		System.out.println(lucky1);
		System.out.println(lucky2);
		System.out.println(lucky1 * lucky2);
	}
}
