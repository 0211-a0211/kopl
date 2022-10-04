package course23;

class teacher {
	String subject;
	String name;
	String gender;
	long salary;
	int age;

}

class 例題7_1 {
	public static void main(String[] args) {
		teacher ishihama = new teacher();
		ishihama.subject = "jave";
		ishihama.name = "石濱先生";
		ishihama.gender = "男";
		ishihama.salary = 1600;
		ishihama.age = 42;
		System.out.println("担当科目:" + ishihama.subject);
		System.out.println("名前:" + ishihama.name);
		System.out.println("性別:" + ishihama.gender);
		System.out.println("給料:" + ishihama.salary);
		System.out.println("年齢:" + ishihama.age);

	}
}
