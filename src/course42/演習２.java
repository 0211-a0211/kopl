package course42;

import java.util.ArrayList;

class 演習２ {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("XXX");
		list.add("YYY");
		list.add("ZZZ");

		if (list.contains("WWW")) {

		} else {
			list.add("WWW");
		}

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}
}
