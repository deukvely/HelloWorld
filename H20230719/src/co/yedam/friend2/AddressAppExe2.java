package co.yedam.friend2;

import java.util.Scanner;

import co.yedam.friend.Friend;
import co.yedam.friend.UniFriend;

public class AddressAppExe2 {
	public static void main(String[] args) {

		// 1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료
		Scanner scn = new Scanner(System.in);
		AddressApp2 app2 = new AddressApp2();
		boolean run = true;
		int menu;

		while (run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료");
			try {
				menu = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("메뉴 잘못 선택.");
				continue;
			}
			try {
				if (menu < 1 || menu > 6) {
					throw new MenuException2(menu);
				}
			} catch (MenuException2 e) {
				e.showMessage();
				continue;
			}

			if (menu == INIT_MENU2.ADD) {
				System.out.println("등록> 1.학교 2.회사 3.친구");
				int frd = Integer.parseInt(scn.nextLine());
				if (frd == 1) {
					System.out.println("학교 친구 등록");
					System.out.println("이름 연락처 학교 전공");
					String name = scn.next();
					String phone = scn.next();
					String univ = scn.next();
					String major = scn.next();
					scn.nextLine();

					if (app2.addFriend(new UniFriend2(name, phone, univ, major)) == false) {
						System.out.println("등록실패");
					} else {
						System.out.println("등록성공");
					}
				}
				if (frd == 2) {
					System.out.println("회사 친구 등록");
					System.out.println("이름 연락처 회사 부서");
					String name = scn.next();
					String phone = scn.next();
					String comp = scn.next();
					String dept = scn.next();
					scn.nextLine();

					if (app2.addFriend(new CompFriend2(name, phone, comp, dept)) == false) {
						System.out.println("등록실패");
					} else {
						System.out.println("등록성공");
					}
				} else if (frd == 3) {
					System.out.println("친구 등록");
					System.out.println("이름 연락처");
					String name = scn.next();
					String phone = scn.next();
					scn.nextLine();

					if (app2.addFriend(new Friend2(name, phone)) == false) {
						System.out.println("등록실패");
					} else {
						System.out.println("등록성공");
					}
				}
			} else if (menu == INIT_MENU2.LIST) {
				System.out.println("친구 목록");
				Friend2[] ary = app2.friendList();
				for (int i = 0; i < ary.length; i++) {
					if (ary[i] != null) {
						System.out.printf("이름 : %s 연락처 %s\n", ary[i].getName(), ary[i].getPhone());
					}
				}
			} else if (menu == INIT_MENU2.EDIT) {

			} else if (menu == INIT_MENU2.DEL) {

			} else if (menu == INIT_MENU2.EXIT) {

			}
		}
	}
}
