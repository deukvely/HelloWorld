package co.micol.miniproject.menu;

import java.util.List;
import java.util.Scanner;

import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;
import co.micol.miniproject.member.serviceImpl.MemberServiceImpl;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService ms = new MemberServiceImpl(); // DB
	// MemberService 인터페이스로 MemberServiceImpl를 씀

	private void mainTitle() {
		System.out.println("==== 회원관리 ====");
		System.out.println("= 1. 전체회원 조회 =");
		System.out.println("= 2. 한명회원 조회 =");
		System.out.println("= 3. 회원정보 등록 =");
		System.out.println("= 4. 회원정보 수정 =");
		System.out.println("= 5. 회원정보 삭제 =");
		System.out.println("= 6. 회원관리 종료 =");
		System.out.println("================");
		System.out.println("원하는 작업번호를 입력하세요? ");
	}

	private void memberSelectList() { // 전체 회원 조회
		List<MemberVO> members = ms.memberSelectList();
		if(!members.isEmpty()) {
			for (MemberVO member : members) {
				member.toString();
			}
		} else {
			System.out.println("회원이 한명도 존재하지 않습니다.");
		}
	}

	// 여기서 CRUD 메소드를 private으로 하나씩 만들어 간다.
	private void memberSelect() { // 한명 회원 조회
		MemberVO member = new MemberVO();
		sc.nextLine();
		System.out.println("===검색할 회원의 아이디를 입력하세요?.===");
		String id = sc.nextLine();
		member.setMemberId(id);
		member = ms.memberSelect(member);
		if (member.getMemberName() != null) {
			member.toString();
		} else {
			System.out.println("존재하지 않는 회원입니다. ㅠㅠ");
		}
	}
	
	private void memberInsert() {
		System.out.println("  ");
		// 이하 구현된 내용 있음
	}

	public void run() {
		boolean b = false;
		do {
			mainTitle();
			int key = sc.nextInt();
			switch (key) {
				case 1:
					memberSelectList();
					break;
				case 2:
					memberSelect();
					break;
				case 3:
					memberInsert();
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
				System.out.println("작업을 종료합니다.!!!");
				b = true;
				break;
			}
		} while (!b);

		sc.close();
	}
}
