package course05;

// 二つの整数値の小さいほうの値と大きいほうの値を求めて表示

import java.util.Scanner;

class Redai3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();

		int min, max; // 小さいほうの値／大きいほうの値
		System.out.println("a/b");
		if (a % b != 0) { // aがbより小さければ
			System.out.println("a%b");

		} else { // そうでなければ

		}

	}
}
