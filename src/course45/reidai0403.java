package course45;

import java.util.HashMap;
import java.util.Map;

class reidai0403 {

	public static void main(String[] args) {

		HashMap<Integer, Boolean> Y = new HashMap<Integer, Boolean>();
		Y.put(30, true);
		Y.put(20, false);
		Y.put(40, false);
		Y.put(50, true);
		int sum = 0;
		for (Map.Entry<Integer, Boolean> entry : Y.entrySet()) {
			if (entry.getValue()) {
				sum += entry.getKey();
			}
		}
		System.out.println(sum);
	}
}
