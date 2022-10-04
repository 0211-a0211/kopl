package course16;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 例題５x {

	public static void main(String[] args) {
		int[] c = { 3, 6, 9, 1, 4, 7, 2, 5, 8 };
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
			System.out.println(sum);
		}
	}
}