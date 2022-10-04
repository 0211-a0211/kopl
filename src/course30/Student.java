package course30;

public class Student {
	int studentId;
	String name;
	int age;
	static int cnt = 0;

	static void printStudentNum() {
		System.out.println(Student.cnt);
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = cnt;
		cnt++;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
