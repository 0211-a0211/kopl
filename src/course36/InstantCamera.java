package course36;

public class InstantCamera implements Camera {
	public void shot() {
		System.out.println("インスタントカメラで撮影");
	}

	public void printPicture() {
		System.out.println("カメラ屋で現像します");
	}
}
