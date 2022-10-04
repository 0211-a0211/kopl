package course30;

class StudentTester1 {

	public static void main(String[] args) {
		Student ishihama = new Student("石濱", 33);
		Student suehara = new Student("末原", 22);

		System.out.println(ishihama.getStudentId());
		System.out.println(ishihama.getName());
		System.out.println(ishihama.getAge());
		Student.printStudentNum();
	}
}
