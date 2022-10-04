package course14;

import java.util.Scanner;

// 文字と文字リテラル

class 例題６ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		boolean isNegative = (a < 0);
		if (isNegative) {
			System.out.println("aはマイナスです。");
		} else {
			System.out.println("aはプラスかゼロです。");
		}
	}
}
