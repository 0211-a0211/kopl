package course18;

class 練習 {

	public static void main(String[] args) {
		int[][] x = {
				{ 1, 2, 3, },
				{ 4, 8, 10, },

		};
		int count = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (x[i][j] % 2 == 0)
					count++;

			}
		}
		System.out.println(count);
	}

}
