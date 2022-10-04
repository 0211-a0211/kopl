package course45;

import java.util.HashMap;

class reidai0201 {

	public static void main(String[] args) {

		HashMap<String, String> HashMap = new HashMap<String, String>();
		HashMap.put("はくさい", "やさい");
		HashMap.put("にんじん", "やさい");
		HashMap.put("りんご", "くだもの");
		HashMap.put("みかん", "くだもの");

		if (HashMap.containsKey("きのこ")) {
			System.out.println(HashMap.get("きのこ"));
		} else {
			System.out.println("存在しません");
		}

	}
}
