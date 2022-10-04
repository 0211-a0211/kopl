package course25;
class Teacher{
	String name;		//名前
	long salary;		//給料
	String subject;	//担当教科
	int age;			//年齢
	String gender;		//性別
}

class Sample01 {
	public static void main(String[] args) {
		Teacher ishihama = new Teacher();
		ishihama.name = "石濱 友裕";
		ishihama.salary = 16_000_000;
		//ishihama.subject = "Java基礎";
		ishihama.age = 18;
		ishihama.gender = "男";

		System.out.println("自己紹介をします。");
		System.out.println("名前: " + ishihama.name);
		System.out.println("給与: " + ishihama.salary + "円");
		System.out.println("担当科目: " + ishihama.subject);
		System.out.println("年齢: " + ishihama.age + "歳");
		System.out.println("性別: " + ishihama.gender);

		//給料を変更する
		ishihama.salary = -10;

		//性別を変更する
		ishihama.gender = "石濱";
	}
}
