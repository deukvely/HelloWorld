package co.yedam.Board;

import co.yedam.member.Member;

public class BoardMain {

	public static void main(String[] args) {
//		message("홍길동");
//		getMax(10, 20);
//		getMemberName(new Member(1001, "홍길동"));
		int result = sum();
		System.out.println("결과값은 "+ result);
	}
	// 반환유형
	public static int sum() {
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		return num1 + num2;
	}
	// 매개변수
	public static void message(String name) {
		System.out.println(name);
		System.out.println("안녕하세요." + name);
		
	}
	// 매개변수 정수형 2개 선언
	public static void getMax(int num1, int num2) {
		if(num1>num2) {
			System.out.println("큰값은 "+num1);
		} else {
			System.out.println("큰값은 "+num2);
		}
	}
	// 클래스 변수
	public static void getMemberName(Member member) {
		System.out.println("이름은 "+member.getMemberName());
	}
}
