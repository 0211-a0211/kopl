package course20;

class Reidai07 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		int[] array = { 5, 7, 3, 2, 5, 9, 6 };

		int total = sumOf(array);

		System.out.println("arrayの合計値：" + total);
	}
}
