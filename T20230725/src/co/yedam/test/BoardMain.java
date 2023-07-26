package co.yedam.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain implements Serializable {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		BoardApp app = new BoardApp();
		boolean run = true;

		while (run) {
			System.out.println("1.추가 2.수정 3.조회 4.삭제 5.목록 6.종료");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				System.out.print("게시글번호: ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("제목: ");
				String title = scn.nextLine();
				System.out.print("내용: ");
				String content = scn.nextLine();
				System.out.print("작성자: ");
				String writer = scn.nextLine();
				System.out.print("작성일자:");
				String date = scn.nextLine();

				if (app.register(new Board(no, title, content, writer, date))) {
					System.out.println("추가되었습니다.");
				} else {
					System.out.println("추가가 실패하였습니다.");
				}
			} else if (menu == 2) {
				System.out.print("게시글번호: ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("수정할 내용: ");
				String contents = scn.nextLine();

				if (app.modify(no, contents)) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("수정이 실패하였습니다.");
				}
			} else if (menu == 3) {
				System.out.print("조회할 번호: ");
				int no = Integer.parseInt(scn.nextLine());

				if (app.search(no) != null) {
					System.out.println("조회되었습니다.");
					System.out.println(app.search(no));
				} else {
					System.out.println("조회가 실패하였습니다.");
				}
			} else if (menu == 4) {
				System.out.print("조회할 번호: ");
				int no = Integer.parseInt(scn.nextLine());

				if (app.remove(no)) {
					System.out.println("삭제되었습니다.");
				} else {
					System.out.println("삭제가 실패하였습니다.");
				}
			} else if (menu == 5) {
				System.out.println("전체 목록");
				List<Board> boards = new ArrayList<>();
				boards = app.list();
				for (int i = 0; i < boards.size(); i++) {
					System.out.println(boards.get(i).toString());
				}
			} else if (menu == 6) {
				app.storeToFile();
				run = false;
			} else {
				System.out.println("그런 번호는 없습니다.");
				continue;
			}
		}
	}
}
