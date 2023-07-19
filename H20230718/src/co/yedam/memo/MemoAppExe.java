package co.yedam.memo;

import java.util.Scanner;

import co.yedam.student.Student;

public class MemoAppExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		MemoApp app = new MemoApp();
		
		
		while(run) {
			System.out.println("1.메모등록 2.메모수정 3.메모삭제 4.메모목록 5.메모조회 6.종료");
			int mNo = Integer.parseInt(scn.nextLine());
			// 등록
			if(mNo == 1) {
				System.out.println("번호 내용 날짜 작성");
				String no = scn.next();
				String content = scn.next();
				String date = scn.next();
				String no1 = scn.nextLine();
//				System.out.println(no+" "+ content+" "+date);
				Memo memo = new Memo(no, content, date);
				if(app.addMemo(memo)) {
					System.out.println("정상적으로 등록되었습니다.");
				} else {
					System.out.println("등록이 안 되었습니다.");
				}
			// 수정
//			} else if(mNo == 2) {
//				boolean isExist = false;
//				System.out.println("수정>> ");
//				System.out.print("번호입력");
//				int num = Integer.parseInt(scn.nextLine());
//				for (int i = 0; i < app.memo.length; i++) {
//					if(app.memo[i] != null && app.memo[i] == num) {
//						app.memo[i] = null;
//						System.out.println("삭제 완료되었습니다.");
//						// 변경 후 반복문 종료
//						isExist = true;
//						break;
//					}
//				}
			} else if(mNo == 3) {
//				
			} else if(mNo == 4) {
				Memo[] ary = app.memoList();
				for(int i = 0; i < ary.length; i++) {
					if(ary[i] != null) {
						System.out.printf("학생번호 %s, 이름 %s, 점수 %d\n",
								ary[i].no, ary[i].content, ary[i].date);
					}
				}
			} else if(mNo == 5) {
				
			} else if(mNo == 6) {
				System.out.println("종료");
				run = false;
			}
		}
		System.out.println("end of prog");
	} 
}