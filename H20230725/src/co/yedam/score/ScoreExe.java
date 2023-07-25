package co.yedam.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		ScoreApp app = new ScoreApp();

		while (run) {
			System.out.println("1.학생정보입력 2.성적입력 3.전체성적출력 4.장학금대상자 5.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				System.out.print("학번은>> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("이름은>> ");
				String name = scn.nextLine();
				System.out.print("국어는>> ");
				int kor = Integer.parseInt(scn.nextLine());
				System.out.print("영어는>> ");
				int eng = Integer.parseInt(scn.nextLine());
				System.out.print("수학은>> ");
				int math = Integer.parseInt(scn.nextLine());

				Score score = new Score(no, name, kor, eng, math);
				if (app.addStudent(score)) {
					System.out.println("정상 등록");
				} else {
					System.out.println("등록 오류");
				}
				break;
			case 2:
				System.out.print("학번은>> ");
				int stuNo = Integer.parseInt(scn.nextLine());
				if (!app.isExist(stuNo)) { // ! true일 때 false
					System.out.println("그런 번호 없습니다.");
					continue; // 다시 실행
				}
				System.out.print("국어는>> ");
				kor = Integer.parseInt(scn.nextLine());
				System.out.print("영어는>> ");
				eng = Integer.parseInt(scn.nextLine());
				System.out.print("수학은>> ");
				math = Integer.parseInt(scn.nextLine());
				if (app.addScore(stuNo, kor, eng, math)) {
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("수정 실패");
				}
				
				break;
			case 3:
				List<Score> scores = new ArrayList<>();
				scores = app.studentList();
				for(int i = 0; i < scores.size(); i++) {
					System.out.println(scores.get(i).toString());
				}
				break;
			case 4:
				app.award();
				break;
			case 5:
				
				if (app.storeToFile()) {
					System.out.println("저장 완료");
				}
				run = false;
				break;
			default:
				System.out.println("그런 번호 없습니다.");
				continue;
			}
		}
	}
}
