package co.yedam.collect.board;

import java.util.Scanner;

// 로그인 처리 => 기능 사용.
// 로그인 아이디 == 작성자
// 1.등록 2.목록 3.단건조회 4.삭제 9.종료

public class MainExe {
	public static void main(String[] args) {
		String logId = "";
		UserApp userApp = new UserApp();
		BoardApp boardApp = new BoardApp();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		boolean log = true;
		while (run) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디>>");
			String id = scn.nextLine();
			System.out.println("비밀번호>>");
			String pass = scn.nextLine();

			if (userApp.login(id, pass) == true) {
				System.out.println("로그인 성공.");

			} else if (userApp.againLogin(id, pass)) {
				System.out.println("비밀번호가 다릅니다.");
				continue;

			} else if (userApp.users.containsValue(pass)) {
				System.out.println("아이디가 다릅니다.");
				continue;

			} else {
				System.out.println("정보가 없습니다.");
				continue;
			}

			while (log) {
				System.out.println("1.등록 2.목록 3.단건조회 4.삭제 9.종료");
				int menu = Integer.parseInt(scn.nextLine());
				if (menu == 1) {
					System.out.print("게시물 번호: ");
					int boardNo = Integer.parseInt(scn.nextLine());
					System.out.print("제목: ");
					String title = scn.nextLine();
					System.out.print("내용: ");
					String content = scn.nextLine();

					// 같은 의미
					Board brd = new Board(boardNo, title, content, id);
					boardApp.addBoard(brd);
					// boardApp.addBoard(new Board(boardNo, title, content, id));

				} else if (menu == 2) {
					System.out.println(boardApp.boardList());
				} else if (menu == 3) {
					System.out.println("상세조회");
					System.out.println("번호");
					int number = Integer.parseInt(scn.nextLine());
					
					Board board = boardApp.getBoard(number); 
					System.out.println(board);
					
				} else if (menu == 4) {
					System.out.println("삭제할 번호");
					int boardNo = Integer.parseInt(scn.nextLine());
					
				} else if (menu == 9) {
					System.out.println("종료");
					run = false;
				}
			}
		}

	}
}
