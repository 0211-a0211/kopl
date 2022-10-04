package course39;

import java.util.InputMismatchException;
import java.util.Scanner;

class Reidai03 {

	public static void main(String[] args) {
		try {
			Scanner stdIn = new Scanner(System.in);
			System.out.print("配列のサイズを入力:");
			int num = stdIn.nextInt();

			String[] array = new String[num];
			int num2 = num;
			if (num % 2 == 0) {
				num2++;
			}

			for (int i = 0; i < num2; i++) {
				if (i < 10) {
					array[i] = "abc";
				}
				System.out.println("文字:" + array[i] + " ,サイズ:" + array[i].length());
			}

		} catch (NullPointerException e) {
			System.out.println("NullPointerExceptionを補足しました");
		} catch (NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeExceptionを補足しました");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsExceptionを補足しました");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchExceptionを補足しました");
		}
	}

}
