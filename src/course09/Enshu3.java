package course09;

import java.util.Scanner;

class Enshu3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int i = 0;
		while (n - 1 >= i) {
			System.out.println(i);
			i++;
		}
	}
}
