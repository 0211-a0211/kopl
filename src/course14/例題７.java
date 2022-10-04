package course14;

// 二つの数値の商を求める

class 例題７ {

	public static void main(String[] args) {
		int sum = 0;
		int n = 50;
		for (int i = 1; i < n; i++)
			sum += i;
		System.out.println(sum);
		System.out.println((double) sum / n);
	}
}
