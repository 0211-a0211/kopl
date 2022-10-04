package course07;

// 読み込んだ整数値の桁数（ゼロ／１桁／２桁以上）を判定

import java.util.Scanner;

class Reidai1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("整数値：");
		int ｘ = stdIn.nextInt();
		if (ｘ >= 6 && ｘ <= 12) { // １桁
			System.out.println("小学生");
		}
	}
}
