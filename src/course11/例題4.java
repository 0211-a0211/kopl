package course11;

// 読み込んだ整数値のすべての約数を表示

import java.util.Scanner;

class 例題4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3==0) {
				System.out.println("FIZZ");
				else {
					System.out.println(i);	
				}
        
			}
		}
	}
}
