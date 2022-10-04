package course07;

// 読み込んだ整数値の桁数（ゼロ／１桁／２桁以上）を判定

import java.util.Scanner;

class Reidai2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値x：");
		int ｘ = stdIn.nextInt();
		Scanner stdIn1 = new Scanner(System.in);
		System.out.print("整数値y：");
		int y = stdIn1.nextInt();
		if (ｘ >= 0 || y >= 0) { // １桁
			System.out.println("YES");
		}
	}
}
