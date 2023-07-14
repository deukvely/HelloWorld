package co.yedam.reference;

import java.util.Scanner;

public class ArrayPracticeExe {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null;
		int max = 0;
		int avg = 0;
		int hap = 0;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());	
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores["+i+"]> ");
					int score = Integer.parseInt(scn.nextLine());
					scores[i] = score;
				}
			} else if (selectNo == 3) {
				for(int list : scores) {
					System.out.println(list);
				}
				// 작성위치
			} else if (selectNo == 4) {
				for(int i = 0; i < studentNum; i++) {
					hap += scores[i]; 
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				avg = hap / studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				// 작성위치
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
	}
	
}
