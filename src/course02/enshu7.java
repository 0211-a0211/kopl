package course02;

// 名前を読み込んで挨拶する（その２：nextLine()版）

import java.util.Scanner;

class enshu7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("名前：");
		String str = stdIn.nextLine();
		Scanner stdIn1 = new Scanner(System.in);
		System.out.print("クラス名：");
		String str1 = stdIn.nextLine();
		Scanner stdIn2 = new Scanner(System.in);
		System.out.print("生年月日：");
		String str2 = stdIn.nextLine();
		Scanner stdIn3 = new Scanner(System.in);
		System.out.print("身長：");
		String str3 = stdIn.nextLine();
		System.out.println("名前:" + str);
		System.out.println("クラス名:" + str1);
		System.out.println("生年月日:" + str2);
		System.out.println("身長:" + str3);
	}
}
