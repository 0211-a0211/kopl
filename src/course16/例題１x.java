package course16;

// 構成要素型がint型の配列（構成要素数は５：newによって本体を生成）

class 例題１x {

	public static void main(String[] args) {
		int[] b = new int[3]; // 配列の宣言
		//int[] b =[30.15.7]でもまる
		b[0] = 30; // a[1]に37を代入
		b[1] = 15; // a[2]に51を代入
		b[2] = 7; // a[4]に74を代入

		for (int i = b[0]; i < b.length; i++) {

		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}
}
