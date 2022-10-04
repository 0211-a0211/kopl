package course45;

import java.util.HashMap;

class reidai1 {

	public static void main(String[] args) {

		HashMap<String, Double> HashMap = new HashMap<String, Double>();
		HashMap.put("りんご", 53.2);
		HashMap.put("ごりら", 204.1);
		HashMap.put("らっこ", 180.0);
		HashMap.put("こおろぎ", 11.4);

		System.out.println(HashMap.get("りんご"));
		System.out.println(HashMap.get("ごりら"));
		System.out.println(HashMap.get("らっこ"));
		System.out.println(HashMap.get("こおろぎ"));
	}
}
