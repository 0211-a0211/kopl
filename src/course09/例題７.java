package course09;

// 1からnまでの総和を求める

import java.util.Scanner;

class 例題７ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの総和を求めます。");

		//説明の都合上、以下3行を教科書から変更しています。
		int n;
		System.out.print("nの値：");
		n = stdIn.nextInt();

		int sum = 0; // 合計

		for (int i = 1; i <= n; i++) {
			sum += i; // sumにiを加える
			if (sum >= 1000)
				break;
		}
		System.out.println("1から" + n + "までの総和は" + sum + "です。");
	}
}
