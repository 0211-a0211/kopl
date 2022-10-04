package pre_exam;

class Book {
	String title; //タイトル
	String genre; //ジャンル
	int pageLength; //ページ数

	public Book(String title, String genre, int pageLength) {
		super();
		this.title = title;
		this.genre = genre;
		this.pageLength = pageLength;
	}

	void display() {
		System.out.println("タイトル: " + this.title);
		System.out.println("ジャンル: " + this.genre);
		System.out.println("値段: " + this.pageLength);

	}

}

public class Q13 {
	public static void main(String[] args) {
		Book book = new Book("ハリーポッターと賢者の石", "ファンタジー", 455);

		book.display();

	}
}
