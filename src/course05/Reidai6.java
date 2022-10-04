package course05;

// 読み込んだ整数値が正であれば偶数／奇数を判定して表示

import java.util.Scanner;

class Reidai6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("x：");
		int x = stdIn.nextInt();
		System.out.print("y：");
		int y = stdIn.nextInt();

		if (x * y > 0) {
			if (x > y) {
				System.out.println("xもyも正");
			} else {
				System.out.println("xもyも負");
			}
		} else {
			System.out.println("xかyが負");
		}
	}
}
