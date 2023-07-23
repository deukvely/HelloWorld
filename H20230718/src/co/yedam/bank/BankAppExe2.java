package co.yedam.bank;

import java.util.Scanner;

public class BankAppExe2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		BankApp2 app2 = new BankApp2();

		while (run) {
			System.out.println("1.등록 2.입금 3.출금 4.잔액조회 5.계좌목록 6.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				System.out.println("정보입력");
				System.out.print("계좌번호 입력> ");
				String accountNo = scn.nextLine();
				System.out.print("예금주 입력> ");
				String name = scn.nextLine();
				System.out.print("입금액 입력> ");
				int money = Integer.parseInt(scn.nextLine());

				Account2 account2 = new Account2(accountNo, name, money);

				if (app2.registerAccount(account2)) {
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 X");
				}

			} else if (menu == 2) {
				System.out.println("계좌번호 입력> ");
				String accountNo = scn.nextLine();
				System.out.print("입금액 입력> ");
				int money = Integer.parseInt(scn.nextLine());

				if (app2.deposit(accountNo, money)) {
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 X");
				}

			} else if (menu == 3) {
				System.out.println("계좌번호 입력> ");
				String accountNo = scn.nextLine();
				System.out.print("출금액 입력> ");
				int money = Integer.parseInt(scn.nextLine());

				if (app2.whithdraw(accountNo, money)) {
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 X");
				}
			} else if (menu == 4) {
				System.out.println("계좌번호 출력> ");
				System.out.println(app2.checkBalance());

			} else if (menu == 5) {
//				System.out.print("번호입력>>");
//				String str = scn.nextLine();
//				String result = app2.accountList();
//				if (result != null) {
//					System.out.printf("회원번호: %s, 메모내용: %s\n", str, result);
//				} else {
//					System.out.println("회원번호가 없습니다.");
//				}
			} else if (menu == 6) {
				System.out.println("종료");
				run = false;
			}
		}
	}
}
