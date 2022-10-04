package course42;

import java.util.ArrayList;

class 演習４ {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("XXX");
		list.add("YYY");
		list.add("ZZZ");
		//for (int i = 0; i < 3; i++) {
		//System.out.println(list.get(i));
		//}
		for (String el : list) {
			System.out.println(el);
		}
	}
}
