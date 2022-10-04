package course02;
// 0～9のラッキーナンバーを乱数で生成して表示

import java.util.Random;

class LuckyNo2 {

	public static void main(String[] args) {
		Random rand = new Random();

		int lucky = rand.nextInt(31); // 0～9の乱数

		System.out.println(lucky);
		System.out.println(lucky);
		System.out.println(lucky * lucky);
	}
}
