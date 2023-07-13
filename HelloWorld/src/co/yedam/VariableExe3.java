package co.yedam;

public class VariableExe3 {
	public static void main(String[] args) {
		// 정수, 실수, => 기본 데이터 타입(변수에 값이 저장)
		PrintExe exe = new PrintExe(); // 클래스.
		// 참조데이터타입(변수에 주소값이 저장)
		System.out.println(exe); // 생성자에 의해서 인스턴스의 주소.
		
		String str = "\"He\"tllo";
		System.out.println(str);
		
		int num1 = 100;
		int num2 = 120;
		
		System.out.println(num1 == num2);
		
		String str1 = "Hello"; // 주소값
		String str2 = "Hello"; // 주소값
		
		// 문자열 비교일 경우에는 equals 메소드.
		System.out.println(str1.equals(str2));
		
	}
}
