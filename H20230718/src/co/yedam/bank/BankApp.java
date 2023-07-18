package co.yedam.bank;

import java.util.Scanner;

import co.yedam.student.Student;

public class BankApp {
	Scanner scn = new Scanner(System.in);
	Account[] accounts;
	int accountNum = 0;
	
	// 싱글톤 방식
	private static BankApp instance = new BankApp();
	
	boolean addAccount(Account acc) {
		if(accountNum >= 2) { // 등록할 공간 부족 => 실패
			return false;
		}
		accounts[accountNum++] = acc;
		return true;
	}
	
	
	void BankApp() {
		accounts = new Account[10];
	}

	void registerAccount() {
		Student[] studentList() {
//			for (int i = 0; i < studentNum; i++) {
//				System.out.printf("학생번호 %s, 이름 %s, 점수 %d\n",
//						students[i].stdNo, students[i].stdName, students[i].score);
//			}
			return students;
		}

	}

	void deposit() {
		int sum = 0;
		for (int i = 0; i < studentNum; i++) {
			sum += students[i].score;
		}
		return sum;
//		System.out.println("점수의 합계: " + sum );
	}

	void whithdraw() {
		System.out.println("계좌출금합니다.");
	}

	void checkBalance() {
		System.out.println("계좌잔액입니다.");
	}

	void accountList() {
		System.out.println("계좌목록입니다.");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				System.out.printf("계좌번호 %d, 예금주 %s, 잔고 %d", accounts[i].no, accounts[i].name, accounts[i].balance);
			}
		}
	}
}
