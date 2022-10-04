package course45;

import java.util.HashMap;

class reidai0302 {

	public static void main(String[] args) {
		int count = 0;
		HashMap<String, String> HashMap = new HashMap<String, String>();
		HashMap.put("はくさい", "やさい");
		HashMap.put("にんじん", "やさい");
		HashMap.put("りんご", "くだもの");
		HashMap.put("みかん", "くだもの");
		for (String key : HashMap.keySet()) {

			if ("やさい".equals(HashMap.get(key))) {
				count++;
			}
		}
		System.out.println(count);
	}
}
