package course45;

import java.util.HashMap;

class reidai202 {

	public static void main(String[] args) {

		HashMap<String, String> HashMap = new HashMap<String, String>();
		HashMap.put("はくさい", "やさい");
		HashMap.put("にんじん", "やさい");
		HashMap.put("りんご", "くだもの");
		HashMap.put("みかん", "くだもの");

		if (HashMap.containsKey("りんご")) {
			System.out.println(HashMap.get("りんご"));
			HashMap.remove("りんご");
		}
		System.out.println(HashMap.size());
	}
}
