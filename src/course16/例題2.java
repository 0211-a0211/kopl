package course16;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 例題2 {

	public static void main(String[] args) {
		int[] c = new int[10]; // 配列の宣言

		c[0] = 0; // a[1]に37を代入
		c[1] = 3; // a[2]に51を代入
		c[2] = 6; // a[4]に74を代入

		for (int i = 0; i < c.length; i++) {
			c[i] = i * 3;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println("b[" + i + "] = " + c[i]);
		}

	}
}
