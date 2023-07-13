package co.yedam;

import java.util.Scanner;

public class OperatorExe {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int max = 0;
		int avg = 0;
		System.out.println("정수1");
		String d1 = sca.nextLine();
		System.out.println("정수2");
		String d2 = sca.nextLine();
		System.out.println("정수3");
		String d3 = sca.nextLine();
		
		avg = (Integer.parseInt(d1) + Integer.parseInt(d2) + Integer.parseInt(d3))/3;
		
		if(Integer.parseInt(d1)>max) {
			max = Integer.parseInt(d1);
		}
		if(Integer.parseInt(d2)>max) {
			max = Integer.parseInt(d2);
		}
		if(Integer.parseInt(d3)>max) {
			max = Integer.parseInt(d3);
		}
		System.out.println("최대값은 "+ max+"이고 평균은 "+avg+"입니다.");
	}
}
