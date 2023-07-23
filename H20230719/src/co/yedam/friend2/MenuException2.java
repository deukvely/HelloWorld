package co.yedam.friend2;

public class MenuException2 extends Exception {
	int choice;
	
	public MenuException2(int choice) {
		this.choice = choice;
	}
	
	public void showMessage() {
		System.out.println(choice + "는 잘못된 메뉴입니다.");
	}
}
