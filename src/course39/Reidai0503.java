package course39;

import java.util.Scanner;

class Reidai0503 {

	public static void rank(int x) throws RuntimeException {
		String str = null;
		if (x >= 80) {
			str = "*****";
		} else if (x >= 60) {
			str = "***";
		} else if (x >= 50) {
			str = "*";
		}
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			throw new RuntimeException("実行時例外発生");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.print("数値1を入力:");
			Scanner stdIn = new Scanner(System.in);
			int x = stdIn.nextInt();

			rank(x);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
