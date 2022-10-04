package course16;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 演習１ {

	public static void main(String[] args) {
		int[] a = { 4, 10, 16, 22 };
		int sum = 0;
		for (int i = 0; i <= a.length; i++) {
			sum += a[i];
			System.out.println(sum);
		}
	}
}
