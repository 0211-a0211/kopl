package course11;

// 九九の表を表示

class 例題５ {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("\t"); //説明の都合上、処理を変更しています。
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
