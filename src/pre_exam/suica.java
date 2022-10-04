package pre_exam;

import java.util.Scanner;

public class suica {
	public static void main(String[] args) {
		int hyou[][] = {
				{ 0, 140, 160 },
				{ 140, 0, 120 },
				{ 160, 120, 0 }
		};
		int senntaku = 0;
		int zanndaka = 1000;
		while (senntaku == 0) {

			System.out.println("現在の残高:" + zanndaka);
			Scanner stdin = new Scanner(System.in);
			System.out.println("現在の駅を入力してください");
			int noru = stdin.nextInt();
			System.out.println("稲毛なら0,西千葉なら1,千葉なら2");
			Scanner stdin2 = new Scanner(System.in);
			System.out.println("降りる駅を入力してください");
			int oriru = stdin2.nextInt();
			zanndaka = zanndaka - hyou[noru][oriru];
			System.out.println("稲毛なら0,西千葉なら1,千葉なら2");
			System.out.println("運賃は" + hyou[noru][oriru] + "円です。" + "残高は" + zanndaka + "円です。");
			Scanner stdin3 = new Scanner(System.in);
			System.out.println("続けるなら0を,やめるなら99を入力");
			senntaku = stdin3.nextInt();
		}
	}
}
