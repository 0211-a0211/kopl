package course02;

// 名前を読み込んで挨拶する（その２：nextLine()版）

import java.util.Scanner;

class enshu6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("文字列：");
		String str = stdIn.nextLine();

		System.out.println(str + str + str);

	}
}
