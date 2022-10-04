package course22;

public class MethodTest2 {
	static String showStrs(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		String a = "I am";
		String b = "a student";
		System.out.print("String型a+b=" + showStrs(a, b));
	}
}
