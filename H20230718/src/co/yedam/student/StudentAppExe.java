package co.yedam.student;

import java.util.Scanner;

public class StudentAppExe {
	public static void main(String[] args) {
		// 메뉴: 1.등록 2.목록 3.합계 4.최고점 5.종료
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		StudentApp app = new StudentApp();
		
//		app.addStudent(new Student("001", "홍길동", 80, 177.7));
//		app.addStudent(new Student("002", "김길동", 88, 187.7));
		
		app.studentList();
		app.sumScore();
		app.maxPrint();
		
		boolean isExist = false;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.합계 4.최고점 5.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			if (menu == 1) {				
				System.out.print("학번> ");
				String no = scn.nextLine();
				System.out.print("이름> ");
				String name = scn.nextLine();
				System.out.print("점수> ");
				int score = Integer.parseInt(scn.nextLine());
				System.out.print("키> ");
				double height = Double.parseDouble(scn.nextLine());
				
				Student student = new Student(no, name, score, height);
				if(app.addStudent(student)) {
					System.out.println("정상적으로 등록되었습니다.");
				} else {
					System.out.println("등록이 안 되었습니다.");
				}
				
			} else if(menu == 2) {
				Student[] ary = app.studentList();
				for(int i = 0; i < ary.length; i++) {
					if(ary[i] != null) {
						System.out.printf("학생번호 %s, 이름 %s, 점수 %d\n",
								ary[i].stdNo, ary[i].stdName, ary[i].score);
					}
				}
				
			} else if(menu == 3) {
				int result = app.sumScore();
				System.out.println("점수의 합계: " + result );
				
			} else if(menu == 4) {
				int result = app.maxPrint();
				System.out.println("최고 점수: " + result);
				
			} else if(menu == 5) {
				System.out.println("종료");
				run = false;
			}
		} System.out.println("end of prog");
		
	}
}
