package course07;

// 読み込んだ月の季節を表示

import java.util.Scanner;

class Reidai3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("季節を求めます。\n何月ですか：");
		int month = stdIn.nextInt();

		if (month >= 3 && month <= 5) // 春（3月・4月・5月）
			System.out.println("それは春です。");
		else if (month >= 6 && month <= 8) // 夏（6月・7月・8月）
			System.out.println("それは夏です。");
		else if (month >= 9 && month <= 11) // 秋（9月・10月・11月）
			System.out.println("それは秋です。");
		else if (month == 12 || month >= 1 && month <= 2) // 冬（12月・1月・2月）
			System.out.println("それは冬です。");
		else if (month >= 13 && month <= 14)
			System.out.println("それは冬です。");
		else if (month >= 15 && month <= 17)
			System.out.println("それは春です。");
		else if (month >= 18 && month <= 20)
			System.out.println("それは夏です。");
		else if (month >= 21 && month <= 23)
			System.out.println("それは秋です。");
		else if (month == 24)
			System.out.println("それは冬です。");

	}
}
