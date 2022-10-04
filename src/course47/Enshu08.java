package course47;

import java.util.ArrayList;
import java.util.Random;

class Enshu08 {

	public static void main(String[] args) {
		Random r = new Random();
		int NUM = 1000;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<NUM; i++) {
			list.add(r.nextInt(50));
		}

	}
}
