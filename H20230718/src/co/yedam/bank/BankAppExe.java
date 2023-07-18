package co.yedam.bank;

import java.util.Scanner;

// 사용자화면
public class BankAppExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BankApp app = BankApp.getInstance();
		
		boolean run = true;

		while(run) {
			System.out.println("1.계좌등록기능 2.계좌입금기능 3.계좌출금기능 \n4.계좌잔액확인기능 5.계좌목록확인기능 6.종료");
			int menu = Integer.parseInt(scn.nextLine());
			if(menu == 1) {
				System.out.println("계좌등록하세요.");
				System.out.print("계좌번호>> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("예금주>> ");
				String name = scn.nextLine();
				System.out.print("입금액>> ");
				int balance = Integer.parseInt(scn.nextLine());

				Account account = new Account(no, name, balance);
				if (app.addAccount(account)) {
					System.out.println("정상적으로 등록되었습니다.");
				} else {
					System.out.println("등록이 안 되었습니다.");
				}
			} else if(menu == 2) {
				app.deposit();
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else if(menu == 5) {
				app.accountList();
			} else if(menu == 6) {
				System.out.println("종료되었습니다.");
				run = false;
			}
		}
		System.out.println("end of prog");
	}
}
