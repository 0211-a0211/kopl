package course11;

// 読み込んだ整数値以下の奇数を表示

import java.util.Scanner;

class 例題3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i);
		}
	}
}
