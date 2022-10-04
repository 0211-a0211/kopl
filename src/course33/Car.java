package course33;

public class Car {
	public double gas;
	public int speed;

	public Car() {
		this.gas = 40.0;
		this.speed = 30;
	}

	public double getGas() {
		return gas;
	}

	public int drive() {
		gas -= 1;
		return speed;
	}

}

class SuperCar extends Car {
	int tarbospeed;

	public SuperCar() {
		this.gas = 50.0;
		this.speed = 40;
		this.tarbospeed = 80;
	}

	public void SuperCar() {
		this.gas = 50.0;
		this.speed = 40;
	}

}