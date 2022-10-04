package course47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Enshu09 {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		map.put("ほのお", new ArrayList<String>(Arrays.asList(new String[]{"くさ", "こおり", "むし"})));
		map.put("みず", new ArrayList<String>(Arrays.asList(new String[]{"ほのお", "じめん", "いわ"})));
		map.put("でんき", new ArrayList<String>(Arrays.asList(new String[]{"みず", "ひこう"})));
		map.put("くさ", new ArrayList<String>(Arrays.asList(new String[]{"みず", "じめん", "いわ"})));
		map.put("こおり", new ArrayList<String>(Arrays.asList(new String[]{"くさ", "じめん", "ひこう", "ドラゴン"})));
		map.put("かくとう", new ArrayList<String>(Arrays.asList(new String[]{"ノーマル", "こおり", "いわ"})));
		map.put("どく", new ArrayList<String>(Arrays.asList(new String[]{"くさ", "むし"})));
		map.put("じめん", new ArrayList<String>(Arrays.asList(new String[]{"ほのお", "でんき", "どく", "いわ"})));
		map.put("ひこう", new ArrayList<String>(Arrays.asList(new String[]{"くさ", "かくとう", "むし"})));
		map.put("エスパー", new ArrayList<String>(Arrays.asList(new String[]{"かくとう", "どく"})));
		map.put("むし", new ArrayList<String>(Arrays.asList(new String[]{"くさ", "どく", "エスパー"})));
		map.put("いわ", new ArrayList<String>(Arrays.asList(new String[]{"ほのお", "こおり", "ひこう", "むし"})));
		map.put("ゴースト", new ArrayList<String>(Arrays.asList(new String[]{"ゴースト"})));

		Scanner stdIn = new Scanner(System.in);
		System.out.print("攻撃側タイプ:");String offense = stdIn.nextLine();
		System.out.print("防御側タイプ:");String defense = stdIn.nextLine();
	}
}
