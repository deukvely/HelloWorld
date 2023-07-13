package co.yedam;


import java.util.Scanner;

public class ConditionExe2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
			
		
				while(true) {
					System.out.println("메뉴를 선택하세요: (숫자를 입력)>> ");
					String menu = scn.nextLine();
					System.out.println("1.로그인 2.로그아웃 3.회원가입 4.종료");
					int a = Integer.parseInt(menu);
				switch(a){
				case 1:
					login();
					break;
				case 2:
					logout();
					break;
				case 3:
					signUp();
					break;
				default:
					if(a==4)
					break;
				}
			}	
	} // end of main();
	
	public static void login() {
		System.out.println("로그인메뉴입니다.");
	}
	public static void logout() {
		System.out.println("로그아웃메뉴입니다.");
	}
	public static void signUp() {
		System.out.println("회원가입메뉴입니다.");
	}
}
