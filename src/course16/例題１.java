package course16;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 例題１ {

	public static void main(String[] args) {
		int[] b = new int[100]; // 配列の宣言

		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;

		for (int i = 0; i <= 99; i++) {
			b[i] = i + 1;
		}
		for (int i = 0; i <= 99; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
