package co.yedam.Board;

import java.util.Scanner;

public class BoardExe {

	// 초기값 넣기
	private static void init() {
		Board bo1 = new Board();
		bo1.setTextNo(1001);
		bo1.setTextHead("hi");
		bo1.setTextCon("만나서 반가워요");
		bo1.setTextName("정득화");

		Board bo2 = new Board();
		bo2.setTextNo(1002);
		bo2.setTextHead("bye");
		bo2.setTextCon("즐거운 만남이였네요");
		bo2.setTextName("미스터 득");

		Board bo3 = new Board(1003, "see you again", "그때 그 곳에서", "션샤인");
		boards[0] = bo1;
		boards[1] = bo2;
		boards[2] = bo3;
	}

	// 등록기능
	private static void addBoard() {
		System.out.print("글번호> ");
		int mNo = Integer.parseInt(scn.nextLine());
		System.out.print("글제목> ");
		String head = scn.nextLine();
		System.out.print("글내용>");
		String content = scn.nextLine();
		System.out.print("작성자>");
		String writter = scn.nextLine();
	}

	// 목록기능
	private static void list() {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				System.out.println("글번호: " + boards[i].getTextNo() + " 글제목: " + boards[i].getTextHead() + " 작성자: "
						+ boards[i].getTextName());
			}
		}
	}

	// 삭제기능
	private static void delBoard() {
		System.out.println("삭제할 번호>");
		int no = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == no) {
				boards[i] = null;
				System.out.println("삭제되었습니다.");
			}
		}
	}

	// 수정기능
	private static void editBoard() {
		boolean isExist = false; // 조회결과 존재 여부 체크
		System.out.print("수정할 번호>");
		int no = Integer.parseInt(scn.nextLine());
		System.out.print("수정하시오(글내용)>");
		String co = scn.nextLine();
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == no) {
				boards[i].setTextCon(co);
			}
		}
	}

	// 상세보기 기능
	private static void getBoard() {
		System.out.println("상세번호");
		int no = Integer.parseInt(scn.nextLine());
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == no) {
				System.out.println(boards[i].all());
			}
		}
	}

	static Board[] boards = new Board[10];
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		init();// 실행.
		boolean run = true;
		while (run) {
			System.out.println("1.글등록\n" + "2.목록\n" + "3.수정\n" + "4.삭제\n" + "5.상세보기\n" + "6.종료");
			System.out.print("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				addBoard();
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				editBoard();
			} else if (menu == 4) {
				delBoard();
			} else if (menu == 5) {
				getBoard();
			} else if (menu == 6) {
				System.out.println("종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog.");
	}
} // end of class.
