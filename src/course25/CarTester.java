package course25;

public import course25.sub2.Car;

class Car{
	String vehicleType;		//車種
	double maxSpeed;		//最高時速
	int weight;				//車体重量
	double gasoline;		//ガソリン残量
}

class CarTester {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();

		car1.vehicleType = "スイフト";
		car1.maxSpeed = 135.0;
		car1.weight = 870;
		car1.gasoline = 30.0;

		car2.vehicleType = "ヴェゼル";
		car2.maxSpeed = 160.0;
		car2.weight = 1280;
		car2.gasoline = 35.0;

		System.out.println("■車1の情報");
		System.out.println("　車種:" + car1.vehicleType);
		System.out.println("　最高時速:" + car1.maxSpeed);
		System.out.println("　車体重量:" + car1.weight);
		System.out.println("　ガソリン残量:" + car1.gasoline);

		System.out.println("■車2の情報");
		System.out.println("　車種:" + car2.vehicleType);
		System.out.println("　最高時速:" + car2.maxSpeed);
		System.out.println("　車体重量:" + car2.weight);
		System.out.println("　ガソリン残量:" + car2.gasoline);

		//ガソリンの残量を変更
		car1.gasoline += 30.0;
		car2.gasoline -= 40.0;
		//最高速度を変更
		car1.maxSpeed = 120.0;
		car2.maxSpeed = 180.0;

		System.out.println("■" + car1.vehicleType);
		System.out.println("　ガソリン残量:" + car1.gasoline);
		System.out.println("　最高速度:" + car1.maxSpeed);
		System.out.println("■" + car2.vehicleType);
		System.out.println("　ガソリン残量:" + car2.gasoline);
		System.out.println("　最高速度:" + car2.maxSpeed);
	}
}
