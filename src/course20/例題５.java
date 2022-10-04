package course20;

class 例題５ {

	//--- 文字'*'をn個連続表示 ---//
	static void repeat5(String s) {
		for (int i = 0; i < 5; i++) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		repeat5(s);
	}
}
