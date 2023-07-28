package co.micol.miniproject.menu;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.micol.miniproject.member.service.MemberService;
import co.micol.miniproject.member.service.MemberVO;
import co.micol.miniproject.member.serviceImpl.MemberServiceImpl;
import co.micol.noticeprj.board.service.BoardService;
import co.micol.noticeprj.board.service.BoardVO;
import co.micol.noticeprj.board.serviceImpl.BoardServiceImpl;

public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberService ms = new MemberServiceImpl(); // DA
	private BoardService bs = new BoardServiceImpl();

	private void memberTitle() {
		System.out.println("====회원관리====");
		System.out.println("~1.전체회원 조회~");
		System.out.println("~2.한명회원 조회~");
		System.out.println("~3.회원정보 등록~");
		System.out.println("~4.회원정보 수정~");
		System.out.println("~5.회원정보 삭제~");
		System.out.println("~6.회원관리 종료~");
		System.out.println("=============");
		System.out.println("원하는 작업번호를 입력하세요");
	}

	private void boardTitle() {
		System.out.println("====공지관리====");
		System.out.println("~1.공지사항 조회~");
		System.out.println("~2.공지사항 조회~");
		System.out.println("~3.공지사항 등록~");
		System.out.println("~4.공지사항 수정~");
		System.out.println("~5.공지사항 삭제~");
		System.out.println("~6.공지사항 종료~");
		System.out.println("=============");
		System.out.println("원하는 작업번호를 입력하세요");
	}

	private void mainTitle() {
		System.out.println("====학사관리====");
		System.out.println("=  1.회원 관리  =");
		System.out.println("= 2.공지사항 조회 =~");
		System.out.println("~3.학사관리 종료~");
		System.out.println("=============");
		System.out.println("원하는 작업번호를 입력하세요");
	}

	private void memberSelectList() {
		List<MemberVO> members = ms.memberSelectList();
		if (!members.isEmpty()) {
			for (MemberVO member : members) {
				member.toString();
			}
		} else {
			System.out.println("회원이 한명도 존재하지 않습니다.");
		}
	}

	// 여기서 CRUD 메소드를 private 하니씩 만들어간다.
	// create=INSERT read=SELECT UPDATE DELETE
	private void memberSelect() {
		MemberVO member = new MemberVO();
		System.out.print(">>검색할 회원 ID>> ");
		String id = sc.nextLine();
		member.setMemberId(id);
		member = ms.memberSelect(member);
		if (member.getMemberName() != null) {
			member.toString();
		} else {
			System.out.println("*존재하지 않는 회원*");
		}
	}

	private void memberInsert() {
		System.out.print("아이디 비밀번호 이름 나이 성별 전화번호>> ");
		String str = sc.nextLine();
		String[] data = str.split(" "); // 띄워쓰기 한 거를 배열에 넣음

		// 공백 가능
		System.out.println("주소>> ");
		String addr = sc.nextLine();

		MemberVO member = new MemberVO();
		member.setMemberId(data[0]);
		member.setMemberPassword(data[1]);
		member.setMemberName(data[2]);
		int age = Integer.parseInt(data[3]);
		member.setMemberAge(age);
		member.setMemberGender(data[4]);
		member.setMemberTel(data[5]);
		member.setMemberAddress(addr);

		int result = ms.memberInsert(member);

		if (result == 1) {
			System.out.println("추가");
		} else {
			System.out.println("추가 X");
		}
	}

	private void memberUpdate() {
		System.out.print("아이디 바꿀 이름>> ");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		MemberVO member = new MemberVO();
		member.setMemberId(data[0]);
		member.setMemberName(data[1]);

		int result = ms.memberUpdate(member);
		if (result == 1) {
			System.out.println("수정");
		} else {
			System.out.println("수정 X");
		}
	}

	private void memberDelete() {
		MemberVO member = new MemberVO();
		System.out.print("아이디>> ");
		String str = sc.nextLine();

		member.setMemberId(str);

		int result = ms.memberDelete(member);
		if (result == 1) {
			System.out.println("삭제");
		} else {
			System.out.println("삭제 X");
		}
	}

	private void boardSelectList() {
		List<BoardVO> boards = bs.boardSelectList();
		if (!boards.isEmpty()) {
			for (BoardVO board : boards) {
				board.toString();
			}
		} else {
			System.out.println("회원이 한명도 존재하지 않습니다.");
		}
	}

	private void boardSelect() {
		BoardVO board = new BoardVO();
		System.out.print(">>검색할 번호 ID>> ");
		int id = Integer.parseInt(sc.nextLine());
		board.setBoardId(id);
		board = bs.boardSelect(board);
		if (board.getBoardWriter() != null) {
			board.toString();
		} else {
			System.out.println("*존재하지 않는 순번*");
		}
	}

	private void boardInsert() {
		BoardVO board = new BoardVO();
		System.out.println("번호 작성자 제목 내용 날짜 번호");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		int no = Integer.parseInt(data[0]);
		board.setBoardId(no);
		board.setBoardWriter(data[1]);
		board.setBoardTitle(data[2]);
		board.setBoardSubject(data[3]);
		Date date = Date.valueOf(data[4]); // 문자를 date로 변환
		board.setBoardDate(date);
		int hit = Integer.parseInt(data[0]);
		board.setBoardHit(hit);

		int result = bs.boardInsert(board);
		if (result == 1) {
			System.out.println("등록");
		} else {
			System.out.println("등록 X");
		}
	}

	private void boardUpdate() {
		BoardVO board = new BoardVO();
		System.out.println("번호 수정할 내용");
		String str = sc.nextLine();
		String[] data = str.split(" ");

		int no = Integer.parseInt(data[0]);
		board.setBoardId(no);
		board.setBoardSubject(data[1]);

		int result = bs.boardUpdate(board);
		if (result == 1) {
			System.out.println("수정");
		} else {
			System.out.println("수정 X");
		}
	}

	private void boardDelete() {
		BoardVO board = new BoardVO();
		System.out.println("삭제할 번호");
		int no = Integer.parseInt(sc.nextLine());

		board.setBoardId(no);

		int result = bs.boardDelete(board);
		if (result == 1) {
			System.out.println("삭제");
		} else {
			System.out.println("삭제 X");
		}

	}

	public void mainRun() {
		boolean b = false;
		do {
			mainTitle();
			int key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				memberRun();
				break;
			case 2:
				boardRun();
				break;
			case 3:
				System.out.println("작업을 종료합니다.");
				b = true;
				break;
			}
		} while (!b);
		sc.close();

	}

	public void memberRun() {
		boolean b = false;
		do {
			memberTitle();
			int key = Integer.parseInt(sc.nextLine());
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
				memberUpdate();
				break;
			case 5:
				memberDelete();
				break;
			case 6:
				System.out.println("작업을 종료합니다.");
				b = true;
				break;
			}
		} while (!b);
	}

	public void boardRun() {
		boolean b = false;
		do {
			boardTitle();
			int key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				boardSelectList();
				break;
			case 2:
				boardSelect();
				break;
			case 3:
				boardInsert();
				break;
			case 4:
				boardUpdate();
				break;
			case 5:
				boardDelete();
				break;
			case 6:
				System.out.println("작업을 종료합니다.");
				b = true;
				break;
			}
		} while (!b);
	}

	private void boardList() {
		BoardService bs = new BoardServiceImpl();
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = bs.boardSelectList();

		for (BoardVO board : boards) {
			board.toString();
		}
	}
}
