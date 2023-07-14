package co.yedam;

import java.util.Scanner;

public class WhileLoopExe {
	static Scanner scn = new Scanner(System.in);
	static int balance = 0;
	public static void main(String[] args) {
		boolean run = true;
		
		// 은행: 1.입금, 2.출금, 3.잔액, 4.종료
		// 제한금액 : 10만원, 5만원 + 5.2만원이면 전부 거절
		// 4만원 : 4.5만원 출금 X
		while(run) {
			System.out.println("1.입금, 2.출금, 3.잔액, 4.종료");	
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
			case 1:
				deposit(); 
				break;
			case 2:
				withdraw(); 
				break;
			case 3:
				check(); 
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴를 다시 선택하시오.");
			}
		}
		System.out.println("end of prog.");
	} // end of main
	public static void deposit() {
		System.out.println("입금액을 입력>> ");		
		int in = Integer.parseInt(scn.nextLine());
		if(in + balance <= 100000) {
				balance = balance + in;
				System.out.println("입금 완료");	
		}
		else {
			System.out.println("초과");
			return;
		}
	}
	public static void withdraw() {
		System.out.println("출금액을 입력>> ");
		int out = Integer.parseInt(scn.nextLine());
		if(out >= balance) {						
			System.out.println("초과");
			return;
		}
		else {
			balance = balance - out;
			System.out.println("출금 완료");
		}									
	}
	public static void check() {
		System.out.printf("현재 잔액은 %d원입니다.\n", balance);
	}
	
}
