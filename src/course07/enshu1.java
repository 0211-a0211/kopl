package course07;

// 読み込んだ月の季節を表示

import java.util.Scanner;

class enshu1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("score：");
		int score = stdIn.nextInt();

		if (score >= 80) // 春（3月・4月・5月）
			System.out.println("A判定");
		else if (score >= 60)
			System.out.println("B判定");
		else if (score >= 50) // 秋（9月・10月・11月）
			System.out.println("C判定");
		else if (score >= 0)
			System.out.println("D判定");
	}
}
