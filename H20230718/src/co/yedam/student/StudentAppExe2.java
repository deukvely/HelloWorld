package co.yedam.student;

import java.util.Scanner;

public class StudentAppExe2 {
	public static void main(String[] args) {
		// 메뉴 : 1.등록 2.목록 3.합계 4.최고점 5.종료
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		StudentApp2 app2 = new StudentApp2();

		while (run) {
			System.out.println("1.등록 2.목록 3.합계 4.최고점 5.종료");
			int menu = Integer.parseInt(scn.nextLine());

			if (menu == STUDENT_MENU.ADD) {
				System.out.print("학번은: ");
				String stdNo = scn.nextLine();
				System.out.print("이름은: ");
				String stdName = scn.nextLine();
				System.out.print("점수는: ");
				int Score = Integer.parseInt(scn.nextLine());
				System.out.print("키는: ");
				double height = Double.parseDouble(scn.nextLine());

				if (app2.addStudent(new Student2(stdNo, stdName, Score, height))) {
					System.out.println("정상적으로 등록되었습니다.");
				} else {
					System.out.println("등록이 안 되었습니다.");
				}

			} else if (menu == STUDENT_MENU.LIST) {
				Student2[] ary = app2.studentList();
				for (int i = 0; i < ary.length; i++) {
					if (ary[i] != null) {
						System.out.printf("학생번호 %s 이름 %s 점수%d\n", ary[i].stdNo, ary[i].stdName, ary[i].score);
					}
				}

			} else if (menu == STUDENT_MENU.SUM) {
				int result = app2.sumScore();
				System.out.println("합계는: " + result);

			} else if (menu == STUDENT_MENU.MAX) {
				int result = app2.maxPrint();
				System.out.println("최고 점수: " + result);
				
			} else if (menu == STUDENT_MENU.EXIT) {
				System.out.println("종료");
				run = false;
			}

		}

	}
}
