package course23;

class Dog {
	String breed;
	String name;
	double weight;

}

class enshu2 {
	public static void main(String[] args) {
		Dog stu1 = new Dog();

		stu1.breed = "チワワ";
		stu1.name = "いぬい";
		stu1.weight = 87.9;

		System.out.println("犬種:" + stu1.breed);
		System.out.println("名前:" + stu1.name);
		System.out.println("体重:" + stu1.weight);

	}
}
