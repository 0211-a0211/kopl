package course42;

import java.util.ArrayList;

class 演習３ {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("XXX");
		list.add("YYY");
		list.add("ZZZ");

		if (list.contains("XXX")) {
			list.remove("XXX");
		}

		System.out.println(list.size());
	}
}
