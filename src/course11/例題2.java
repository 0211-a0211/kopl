package course11;

// 読み込んだ個数だけ*を表示

import java.util.Scanner;

class 例題2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int s = stdIn.nextInt();
		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(s);
		}

	}
}
