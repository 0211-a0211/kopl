package course36;

// インタフェースPlayerの利用例

class CameraTester {

	public static void main(String[] args) {
		Camera[] a = new Camera[2];
		a[0] = new InstantCamera(); // ビデオプレーヤ
		a[1] = new DigitalCamera(); // ＣＤプレーヤ

		for (Camera p : a) {
			p.shot(); // 再生
			p.printPicture(); // 停止
			System.out.println();
		}
	}
}
