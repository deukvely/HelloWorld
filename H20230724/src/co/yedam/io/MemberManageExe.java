package co.yedam.io;

import java.util.List;
import java.util.Scanner;

public class MemberManageExe {
	// 이름 주소 연락처 -> 시작(초기값), 추가, 수정, 삭제, 목록, 종료(저장)
	public static void main(String[] args) throws Exception {
		MemberManage manager = new MemberManage();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				System.out.println("이름 주소 연락처");
				String str = scn.nextLine();
				String[] data = str.split(" ");
				Member member = new Member(data[0], data[1], data[2]);
				if (manager.addMember(member)) {
					System.out.println("등록성공");
				} else {
					System.out.println("등록실패");
				}

			} else if (menu == 2) {
				System.out.println("이름 주소 연락처");
				String str = scn.nextLine();
				String[] data = str.split(" ");
				Member member = new Member(data[0], data[1], data[2]);
				if (manager.editMember(member)) {
					System.out.println("등록성공");
				} else {
					System.out.println("등록실패");
				}
				
			} else if (menu == 3) {
				System.out.println("이름");
				String str = scn.nextLine();
				if (manager.delMember(str)) {
					System.out.println("등록성공");
				} else {
					System.out.println("등록실패");
				}
				
			} else if (menu == 4) {
				List<Member> list = manager.list();
				for (Member member : list) {
					System.out.println(member.toString());
				}

			} else if (menu == 5) {
				System.out.println("종료합니다.");
				manager.save();
				run = false;
				
			}
		}
		System.out.println("end of prog.");
		scn.close();
	}

}
