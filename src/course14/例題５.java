package course14;

// 関係演算子・等価演算子・論理否定演算子が生成する値を表示

import java.util.Scanner;

class 例題５ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数n：");
		int n = stdIn.nextInt();

		System.out.println("nは3で割り切れるか→" + (n % 3 == 0));

	}
}
