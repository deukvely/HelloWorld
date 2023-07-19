package co.yedam.memo;

import java.util.Scanner;

public class MemoAppExe2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;
		MemoApp2 app2 = new MemoApp2();
		while (run) {
			System.out.println("1.메모등록 2.메모수정 3.메모삭제 4.메모록록 5.메모조회 6.종료");
			int menu = Integer.parseInt(scn.nextLine());
			if (menu == 1) {
				System.out.println("번호 내용 날짜???");
				String num = scn.next();
				String content = scn.next();
				String date = scn.next();
				scn.nextLine();

				Memo2 memo2 = new Memo2(num, content, date);

				if (app2.addMemo(memo2)) {
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 X");
				}
			} else if (menu == 2) {
				System.out.println("번호입력>>");
				String num = scn.nextLine();
				System.out.print("수정할 메모 입력>> ");
				String str = scn.nextLine();

				if (app2.editMemo(num, str)) {
					System.out.println("수정 O");
				} else {
					System.out.println("회원 X");
				}
			} else if (menu == 3) {
				System.out.println("번호입력>>");
				String num = scn.nextLine();

				if (app2.delMemo(num)) {
					System.out.println("삭제 O");
				} else {
					System.out.println("삭제 X");
				}

			} else if (menu == 4) {
				Memo2[] arr = app2.memoList();
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.printf("메모번호: %s 내용: %s 날짜 %s\n", arr[i].number, arr[i].content, arr[i].date);
					}
				}
			} else if (menu == 5) {
				System.out.print("번호입력>>");
				String str = scn.nextLine();
				String result = app2.findMemo(str);
				if (result != null) {
					System.out.printf("회원번호: %s, 메모내용: %s\n", str, result);				
				} else {
					System.out.println("회원번호가 없습니다.");
				}
				
			} else if (menu == 6) {
				System.out.println("종료");
				run = false;
			}
		}
	}
}
