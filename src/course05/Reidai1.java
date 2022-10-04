package course05;

// 読み込んだ整数値は正の値か？

import java.util.Scanner;

class Reidai1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int x = stdIn.nextInt();
		System.out.print("整数値：");
		int y = stdIn.nextInt();
		if (x > y) {
			System.out.println("xがyより大きいです");
		}
	}
}
