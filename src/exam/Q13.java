package exam;

class Student {
	String name; //名前
	String className; //クラス名
	String birthday; //生年月日

	public Student(String name, String className, String birthday) {
		super();
		this.name = name;
		this.className = className;
		this.birthday = birthday;
	}

	void introduce() {
		System.out.println("自己紹介をします");
		System.out.println("名前: " + this.name);
		System.out.println("クラス名: " + this.className);
		System.out.println("生年月日: " + this.birthday);
	}
}

public class Q13 {
	public static void main(String[] args) {
		Student stu = new Student("石濱 友裕", "2A", "1988/07/03");

		stu.introduce();
	}
}
