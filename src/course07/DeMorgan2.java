package course07;

// 上のif文と下のif文で結果は常に同じです。

import java.util.Scanner;

class DeMorgan2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int x = stdIn.nextInt();
		System.out.print("整数値：");
		int y = stdIn.nextInt();

		if (!(x != 0 && y != 0)) {
			System.out.println("どちらか一方がゼロです。");
		}else {
			System.out.println("両方ともゼロではありません。");
		}
	}
}
