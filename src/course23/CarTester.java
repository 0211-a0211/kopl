package course23;

class Car {
	String teacher;
	String vehicleType;
	String name;
	double maxSpeed;
	int weight;

}

class CarTester {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.name = "スイフト";
		car1.maxSpeed = 135.0;
		car1.weight = 870;
		car2.name = "ヴェゼル";
		car2.maxSpeed = 160.0;
		car2.weight = 1280;
		System.out.println(car1.name);
	}
}
