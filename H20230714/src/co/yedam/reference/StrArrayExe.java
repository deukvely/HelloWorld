package co.yedam.reference;

import java.util.Scanner;

public class StrArrayExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String[] strAry = new String[3]; // 크기가 3인 배열.
		int[] scores = new int[3];
		
		for(String str : strAry) {
			System.out.println(str);
		}
		for(int i = 0; i < strAry.length; i++) {
			System.out.println("이름>> ");
			strAry[i] = scn.nextLine();
			System.out.println("점수>> ");
			scores[i] = Integer.parseInt(scn.nextLine());
		}
		
//		System.out.println("검색하고 싶은 학생의 이름을 입력>>>");
//		String searchName = scn.nextLine();
		// 최고점수를 구하고 학생의 이름
		int maxScore = 0;
		String maxName = "";
		// 전체목록을 출력, strAry에 값 중에서 searchName 같은 값을 출력
		for(int i = 0; i < strAry.length; i++) {
			if(maxScore < scores[i]) {
				maxScore = scores[i];
				maxName = strAry[i];
			}
//			if(strAry[i].equals(searchName)) 
//			System.out.printf("이름은 %s, 점수는 %d \n", strAry[i], scores[i]);
		}
		System.out.printf("이름은 %s 점수는 %d \n", maxName, maxScore);
	}
}
