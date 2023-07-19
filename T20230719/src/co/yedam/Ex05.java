package co.yedam;

import java.util.Scanner;

import co.yedam.student.Student;

public class Ex05 {
	public static void main(String[] args) {
		Friend friend = new Friend();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.목록 3.전화번호수정 4.삭제 5.종료");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.println("이름 전화번호 생년월일 키??");
				String name = scn.next();
				String phone = scn.next();
				String birth = scn.next();
				String height = scn.next();
				scn.nextLine();

				Friend friends = new Friend(name, phone, birth, height);
				if (friends.register(friends)) {
					System.out.println("정상적으로 등록되었습니다.");
				} else {
					System.out.println("등록이 안 되었습니다.");
				}
			} else if (menu == 2) {
				Friend[] ary = Friend.list();
				for (int i = 0; i < ary.length; i++) {
					if (ary[i] != null) {
						System.out.printf("이름 %s, 전화번호 %s, 생년월일 %s 키 %s\n", ary[i].name, ary[i].phone, ary[i].birth,
								ary[i].height);
					}
				}

			} else if (menu == 3) {
				System.out.println("수정할 번호");
			} else if (menu == 4) {

			} else if (menu == 5) {
				System.out.println("종료");
				run = false;
			}
		}
	}

}
