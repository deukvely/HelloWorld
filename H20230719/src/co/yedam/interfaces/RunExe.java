package co.yedam.interfaces;

// 구현클래스
class RunClass implements Runnable {

	@Override
	public void run() {
		System.out.println("RunClass 실행");
	}

}

public class RunExe {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run();

		// 익명 구현객체.
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("익명구현객체 실행.");

			}
		};
		runnable.run();

		// 람다표현식.
		// 간단하게 줄여서 쓸 수 있음
		runnable = () -> System.out.println("익명구현객체 실행2.");
		runnable.run();
	}
}
