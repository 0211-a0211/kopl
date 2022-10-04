package course18;

import java.util.Scanner;

class 例題2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int NUMBER = 5; // 人数
		int[] tensu = new int[NUMBER]; // 点数

		System.out.println(NUMBER + "人の点数を入力せよ。");
		for (int i = 0; i < NUMBER; i++) {
			System.out.print((i + 1) + "番の点数：");
			tensu[i] = stdIn.nextInt(); // tensu[i]を読み込む
		}

		int max = tensu[0];//20から23
		for (int v : tensu) {
			if (v > max) {
				max = v;
			}
		}

		System.out.println("最高点は" + max + "点です。");
	}
}
