package course45;

import java.util.HashMap;
import java.util.Scanner;

class reidai203 {

	public static void main(String[] args) {

		HashMap<String, String> YY = new HashMap<String, String>();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列1：");
		String x = stdIn.nextLine();

		System.out.print("文字列2：");
		String y = stdIn.nextLine();

		YY.put(x, y);
		if (YY.containsKey(x)) {
			System.out.println("キー重複エラー");
		}
		System.out.println(YY.size());
	}
}
