package pre_exam;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数値を入力:");
		int n = stdIn.nextInt();
		int x = 1;
		while (x <= n) {
			System.out.println(x);
			x++;
		}
	}
}
