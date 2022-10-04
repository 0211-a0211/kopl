package course20;

class 例題6 {

	static int get20() {
		return 20;
	}

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += get20();
		}
		System.out.println(sum);
	}
}
