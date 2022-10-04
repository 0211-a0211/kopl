package course11;

// 左下側が直角の直角二等辺三角形を表示

import java.util.Scanner;

class 例題６ {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角の二等辺三角形を表示します。");
		System.out.print("段数は：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)

				System.out.print('*');
			System.out.println();
		}
	}
}
