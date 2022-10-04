package course25.lesson06;

class Account {
	private String name;		// 口座名義
	private String no;			// 口座番号
	private long balance;		// 預金残高

	Account(){
		name = "";
		no = "";
		balance = 0;
	}
	Account(String name, String no, long balance) {
		this.name = name;				// 口座名義
		this.no = no;				// 口座番号
		this.balance = balance;		// 預金残高
	}
	String getName() {
		return name;
	}
	String getNo() {
		return no;
	}
	long getBalance() {
		return balance;
	}
	//--- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}
	//--- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
		if(balance < 0) {
			balance = 0;
		}
	}
}

// 銀行口座クラスをテストするクラス
class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);		// 足立君の口座
		Account nakata = new Account("仲田真二", "654321", 200);		// 仲田君の口座

		adachi.withdraw(200);						// 足立君が200円おろす
		nakata.deposit(100);						// 仲田君が100円預ける

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());	}
}
