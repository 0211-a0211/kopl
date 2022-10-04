package course09;

//正の整数値を０までカウントダウン（その１）

import java.util.Scanner;

class 例題2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("文字を受け取ります:");
		String str = stdIn.nextLine();

		while (!"END".equals(str)) {
			System.out.println("[受け取った文字" + str);
			System.out.println("文字を受け取ります：");
			str = stdIn.nextLine();

		}
	}
}