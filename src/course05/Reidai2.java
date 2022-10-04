package course05;

// 読み込んだ二つの整数値は等しいか

import java.util.Scanner;

class Reidai2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数ｘ：");
		int ｘ = stdIn.nextInt();

		System.out.print("整数ｙ：");
		int ｙ = stdIn.nextInt();

		if (ｘ == ｙ) {
			System.out.println("x==y");
		} else {
			System.out.println("x!=y");
		}
	}
}
