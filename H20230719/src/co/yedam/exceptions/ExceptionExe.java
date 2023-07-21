package co.yedam.exceptions;

import java.util.Scanner;

public class ExceptionExe {
	public static void main(String[] args) {
		// NullPointerException : 널값을 출력하려고 할 때 나타남
		// NumberFormatException : 숫자가 아닌 값이 들어가면 나타남
		Scanner scn = new Scanner(System.in);
		String str = null;
		str = "홍길동";
		int age = 0;
		// try 블럭에서 예외가 발생하면
		// catch 블럭에 정의된 코드 실행
		// 실행예외
		try {
			System.out.println(str.toString());
			age = Integer.parseInt(scn.nextLine());
			System.out.println("이름은 " + str + " 나이는 " + age);
		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("예외가 발생.");
//		} catch(NumberFormatException n) {
//			System.out.println("Format 예외가 발생.");
			
//		finally : 에러와 상관없이 한번은 실행함
		} finally {
			scn.close(); // 리소스 반환 
		}
		// 일반예외
		try {
			Class cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
//		호출한 영역에서 예외처리하기
		try {
			exceptionMethod();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end of prog.");
	}

	public static void exceptionMethod() throws ClassNotFoundException {
		// 예외처리의 책임을 메소드를 호출한 영역으로 떠넘기기
		Class cls = Class.forName("java.lang.String");
	}
}
