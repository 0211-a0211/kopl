package course07;

// ジャンケンの手を表示（switch文）

import java.util.Scanner;

class Reidai5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("手を選べ（0…グー／1…チョキ／2…パー）：");
		int x = stdIn.nextInt();

		switch (x) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		}
	}
}
