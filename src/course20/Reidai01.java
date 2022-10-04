package course20;

import java.util.Scanner;

class Reidai01 {

	//ここにaddメソッドを定義する
	static int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("aの値：");
		int x = stdIn.nextInt();
		System.out.print("bの値：");
		int y = stdIn.nextInt();

		int result = mul(x, y);

		System.out.println("a * b = " + result);
	}
}
