package course20;
// 二つの整数値の最大値を求める（複数のreturn文）

import java.util.Scanner;

class 例題４ {

	//--- a, bの最大値を返却 ---//
	static double minDouble(double a, double b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");
		double a = stdIn.nextDouble();
		System.out.print("整数b：");
		double b = stdIn.nextDouble();

		System.out.println("最小値は" + minDouble(a, b) + "です。");
	}
}
