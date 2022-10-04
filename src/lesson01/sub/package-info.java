package lesson01.sub;

import lesson01.Account;

public class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account(); // 足立君の口座
		Account nakata = new Account(); // 仲田君の口座

		adachi.name = "足立幸一"; // 足立君の口座名義
		adachi.no = "123456"; // 　〃　の口座番号
		adachi.balance = 1000; // 　〃　の預金残高

		nakata.name = "仲田真二"; // 仲田君の口座名義
		nakata.no = "654321"; // 　〃　の口座番号
		nakata.balance = 200; // 　〃　の預金残高

		adachi.balance -= 200; // 足立君が200円おろす
		nakata.balance += 100; // 仲田君が100円預ける

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.name);
		System.out.println("　口座番号：" + adachi.no);
		System.out.println("　預金残高：" + adachi.balance);

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.name);
		System.out.println("　口座番号：" + nakata.no);
		System.out.println("　預金残高：" + nakata.balance);
	}
}
