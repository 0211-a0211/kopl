package course18;

class 例題１ {

	public static void main(String[] args) {
		int[] c = { 3, 6, 9, 1, 4, 7, 2, 5, 8 };
		double sum = 0;
		for (double v : c) {
			sum += v;
			System.out.println(sum);
		}
	}
}