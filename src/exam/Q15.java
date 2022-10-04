package exam;

import java.util.ArrayList;

public class Q15 {
	public static void main(String[] args) {
		int sum = 0;
		int[] array = { 1, 2, 3, 4, 5 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			list.add(array[i]);
			sum += array[i];
		}
		System.out.println(sum);
	}
}