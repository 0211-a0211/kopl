package course02;

// 名前を読み込んで挨拶する（その２：nextLine()版）

import java.util.Scanner;

class HelloNextLine {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("お名前は：");
		String str = stdIn.nextLine();	// １行分の文字列を読み込む

		System.out.println("こんにちは" + str + "さん。");
	}
}
