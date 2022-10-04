package course09;

// 入力された月の季節を表示

import java.util.Scanner;

class CountDownDo {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");

		//説明の都合上、以下3行を教科書と変えています。
		int i;
		i = stdIn.nextInt();
		int sum = 0;
		do {
			System.out.println(i);
			sum += i;
			i--; // xの値をデクリメント（値を１減らす）
		} while (i >= 0);
	}
}
