package course45;

import java.util.HashMap;
import java.util.Map;

class reidai0402 {

	public static void main(String[] args) {
		int count = 0;
		HashMap<String, String> HashMap = new HashMap<String, String>();
		HashMap.put("はくさい", "やさい");
		HashMap.put("にんじん", "やさい");
		HashMap.put("りんご", "くだもの");
		HashMap.put("みかん", "くだもの");
		for (Map.Entry<String, String> entry : HashMap.entrySet()) {
			if ("やさい".equals(entry.getValue())) {
				count++;
			}
		}
		System.out.println(count);

	}
}
