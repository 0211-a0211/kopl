package course16;

import java.util.Scanner;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 演習2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] y = new int[n];
		for (int i = 0; i < n - 1; i++) {
			y[i] = i + 1;
		}
		for (int i = 0; i < n - 1; i++) {
			System.out.println(y[i]);
		}
	}
}
