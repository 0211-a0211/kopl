package course36;

public class SmartPhone extends Phone implements Camera {
	public void shot() {
		System.out.println("スマホで撮影します");
	}

	public void printPicture() {
		System.out.println("コンビニで印刷します");
	}

	public void call(String s) {
		System.out.println(s + "電話をかけます");
	}

	public void recive(String s) {
		System.out.println(s + "からの電話を取ります");
	}

	public interface Player {
		void play();

		void stop();
	}

}
