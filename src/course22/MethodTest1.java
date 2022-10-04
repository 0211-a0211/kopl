package course22;

public class MethodTest1 {
	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		System.out.println("int型 a + b の結果:" + add(a, b));
	}
}
