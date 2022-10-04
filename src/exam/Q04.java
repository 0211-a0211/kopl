package exam;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int n = stdIn.nextInt();
		int x = 0;
		while (x <= n - 1) {
			System.out.println(x);
			x++;
		}

	}
}
