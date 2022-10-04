package course16;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 例題6 {

	public static void main(String[] args) {
		int[] c = { 3, 6, 9, 1, 4, 7, 2, 5, 8 };
		int max = c[0];//20から23
		for (int i = 0; i < c.length; i++) {
			if (c[i] > max) {//11と12の理屈
				max = c[i];

			}

			System.out.println(max);

		}
	}
}
