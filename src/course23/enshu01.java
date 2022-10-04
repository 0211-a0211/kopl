package course23;

class student {
	String studentId;
	String name;
	int level;
	int age;
	int score_1;
	int score_2;
	int score_3;

}

class enshu01 {
	public static void main(String[] args) {
		student stu1 = new student();
		student stu2 = new student();
		stu1.studentId = "51521";
		stu1.name = "からから";
		stu1.age = 34;
		stu1.score_1 = 28;
		stu1.score_2 = 29;
		stu1.score_3 = 30;
		stu2.studentId = "9999999";
		stu2.name = "石濱友裕";
		stu2.age = 32;
		stu2.score_1 = 31;
		stu2.score_2 = 32;
		stu2.score_3 = 33;
		System.out.println("学籍番号:" + stu1.studentId);
		System.out.println("名前:" + stu1.name);
		System.out.println("年齢:" + stu1.age);
		System.out.println("学籍番号:" + stu2.studentId);
		System.out.println("名前:" + stu2.name);
		System.out.println("年齢:" + stu2.age);
		System.out.println("javaの点数:" + stu1.score_1);
		System.out.println("企業と法務の点数:" + stu1.score_2);
		System.out.println("情報システムの点数:" + stu1.score_3);
		System.out.println("javaの点数:" + stu2.score_1);
		System.out.println("企業と法務の点数:" + stu2.score_2);
		System.out.println("情報システムの点数:" + stu2.score_3);

	}
}
