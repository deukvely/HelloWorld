package co.yedam.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.yedam.score.Score;

public class MainExe {
	public static void main(String[] args) {
		boolean run = true;
		boolean running = true;
		Scanner scn = new Scanner(System.in);
		User user = new User();
		BoardExe boardApp = new BoardExe();

		while (run) {
			System.out.println("아이디를 입력하세요.");
			String id = scn.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String pwd = scn.nextLine();

			if (user.login(id, pwd)) {
				System.out.println(id + "님 환영합니다.");
			} else {
				System.out.println("아이디 및 비번이 틀렸습니다.");
				continue;
			}

			while (running) {
				System.out.println("1.글등록 2.글수정 3.글삭제 4.목록 5.종료 9.개인정보");
				int menu = Integer.parseInt(scn.nextLine());
				if (menu == 1) {
					System.out.print("글번호는? ");
					int no = Integer.parseInt(scn.nextLine());
					System.out.print("글제목은? ");
					String title = scn.nextLine();
					System.out.print("글내용은? ");
					String content = scn.nextLine();
					System.out.print("아이디는? ");
					String idd = scn.nextLine();
					System.out.print("날짜는? ");
					String date = scn.nextLine();

//					boardApp.sameId(id);
					Board brd = new Board(no, title, content, id, date);
					if (boardApp.addBoard(brd)) {
						System.out.println("정상 등록");
					} else {
						System.out.println("등록 오류");
					}
				} else if (menu == 2) {
					System.out.print("수정할 번호는? ");
					int no = Integer.parseInt(scn.nextLine());
					System.out.println("수정할 내용은? ");
					String content = scn.nextLine();

					if (boardApp.editBoard(no, content)) {
						System.out.println("수정 완료");
					} else {
						System.out.println("수정 실패");
					}
				} else if (menu == 3) {
					System.out.print("삭제할 번호는? ");
					int no = Integer.parseInt(scn.nextLine());

					if (boardApp.delBoard(no)) {
						System.out.println("수정 완료");
					} else {
						System.out.println("수정 실패");
					}
				} else if (menu == 4) {
					List<Board> board = new ArrayList<>();
					board = boardApp.boardList();
					for (int i = 0; i < board.size(); i++) {
						System.out.println(board.get(i).toString());
					}
				} else if (menu == 5) {
					System.out.println("종료합니다.");
					running = false;
					run = false;
				} else if (menu == 9) {
					System.out.println("개인정보(비번수정)");
					System.out.println("아이디를 입력하세요.");
					id = scn.nextLine();
					System.out.println("새로운 비번은? ");
					String password = scn.nextLine();
					user.rePwd(id, password);

				}

			}
		}
	}
}
