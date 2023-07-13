package co.yedam;

public class MainExe {
	public static void main(String[] args) {
		System.out.println("Hello, Deukhwa");
		System.out.println("jdk compile test");
		
		PrintExe printExe = new PrintExe(); // 생성자 호출
		printExe.showInfo();
	}
}
