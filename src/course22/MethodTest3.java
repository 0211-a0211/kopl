package course22;

public class MethodTest3 {
	static int sumArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 0, 4, 3, 2, 5, 2, 1, 9, 2, 0 };
		int a = sumArray(array);
		System.out.println("arrayの合計値：" + a);
	}
}
