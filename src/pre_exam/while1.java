package pre_exam;

import java.util.Scanner;

public class while1 {
	public static void main(String[] args) {
		int x = 0;
		//Scanner stdIn = new Scanner(System.in);
		Scanner stdIn = new Scanner(System.in);
		System.out.println("Yを入力してください");
		int Y = stdIn.nextInt();
		while (x < Y) {
			System.out.println(x);
			x++;
		}

	}
}
