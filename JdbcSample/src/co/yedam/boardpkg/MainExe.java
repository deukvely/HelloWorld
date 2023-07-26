package co.yedam.boardpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Menu {
	int ADD = 1, EDIT = 2, DEL = 3, LIST = 4, INFO = 5, EXIT = 6;
}

public class MainExe {
	public static void menuPrint() {
		System.out.println("1.등록 2.수정 3.삭제 4.목록 5.개인정보 6.종료");
		System.out.print("선택>> ");
	}

	public static void main(String[] args) {

		BoardService svc = new BoardApp(); // BoardDAO

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		while (true) {
			System.out.print("id>> ");
			String id = scn.nextLine();
			System.out.print("pw>> ");
			String pw = scn.nextLine();
			if (svc.login(id, pw)) {
				System.out.println("로그인 되었습니다.");
				break;
			} else {
				System.out.println("로그인 실패하였습니다.");
			}
		}
		while (run) {
			menuPrint();
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case Menu.ADD:
				System.out.print("글번호 입력> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("글제목 입력>");
				String title = scn.nextLine();
				System.out.print("글내용 입력>");
				String content = scn.nextLine();
				System.out.print("작성자 입력>");
				String writer = scn.nextLine();
				System.out.print("날짜 입력>");
				String date = scn.nextLine();

				if (svc.addBoard(new Board(no, title, content, writer, date))) {
					System.out.println("정상 등록되었습니다.");
				} else {
					System.out.println("등록 실패하였습니다.");
				}
				svc.addBoard(null);
				break;
			case Menu.EDIT:
				System.out.print("수정할 번호 입력> ");
				no = Integer.parseInt(scn.nextLine());
				System.out.println("수정할 내용> ");
				content = scn.nextLine();

				if (svc.editBoard(new Board(no, content))) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("수정 실패하였습니다.");
				}
				svc.editBoard(null);
				break;
			case Menu.DEL:
				System.out.println("종료할 번호 입력");
				no = Integer.parseInt(scn.nextLine());
				
				if (svc.delBoard(no)) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("수정 실패하였습니다.");
				}
//				svc.delBoard(1);
				break;
			case Menu.LIST:
				List<Board> boards = new ArrayList<>();
				for (Board brd : svc.boardList()) {
					System.out.println(brd);
				}
				break;
			case Menu.INFO:
				svc.modInfo(null);
				break;
			case Menu.EXIT:
				System.out.println("종료합니다.");
				if(svc.saveToFile()) {
					System.out.println("저장완료");
					run = true;
				} 
				run = false;
			}
		}
		System.out.println("end of prog.");
		scn.close();
	}
}
