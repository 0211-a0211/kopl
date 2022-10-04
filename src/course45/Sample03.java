package course45;

import java.util.HashMap;

class Sample03 {

	public static void main(String[] args) {

		HashMap<String, Integer> score = new HashMap<String, Integer>();

		score.put("英語", 83);
		score.put("数学", 92);
		score.put("国語", 76);

		for(String key : score.keySet()) {
			System.out.println(key + ": " + score.get(key));
		}
	}
}
