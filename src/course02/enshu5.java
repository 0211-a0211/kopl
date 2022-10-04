package course02;

// 名前を読み込んで挨拶する（その２：nextLine()版）

import java.util.Scanner;

class enshu5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("苗字は？：");
		String str = stdIn.nextLine();
		Scanner stdIn１ = new Scanner(System.in);
		System.out.print("名前は？：");
		String str1 = stdIn１.nextLine();

		System.out.println(str + str);

	}
}
