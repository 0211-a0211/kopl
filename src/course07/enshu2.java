package course07;

// 読み込んだ月の季節を表示

import java.util.Scanner;

class enshu2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("age：");
		int age = stdIn.nextInt();

		if (age >= 6 && age <= 12) // 春（3月・4月・5月）
			System.out.println("小学生");
		else if (age >= 13 && age <= 15) // 夏（6月・7月・8月）
			System.out.println("中学生");
		else if (age >= 16 && age <= 18) // 秋（9月・10月・11月）
			System.out.println("高校生");
		else if (age <= 5 || age >= 19) // 秋（9月・10月・11月）
			System.out.println("国際理工学園生!!!");

	}
}