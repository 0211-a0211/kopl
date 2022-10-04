package course47;

import java.util.ArrayList;
import java.util.Random;

class Enshu07 {

	public static void main(String[] args) {
		Random r = new Random();
		int m = r.nextInt(3) + 5;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		for(int i=0; i<m; i++) {
			ArrayList<Integer> innerList = new ArrayList<Integer>();
			int n = r.nextInt(5) + 2;
			for(int j=0; j<n; j++) {
				int x = r.nextInt(30);
				System.out.print(x + ", ");
				innerList.add(x);
			}
			list.add(innerList);
			System.out.println();
		}

		//ここまで、初期データの登録

	}
}
