package co.yedam.interfaces;

public class MainExe {
	public static void main(String[] args) {
		Audio audio = new Audio();
//		audio.turnOn();
//		audio.turnOff();
		
		Television tv = new Television();
//		tv.turnOn();
//		tv.turnOff();
		
		// 인터페이스
		// audio가 인터페이스에 할당되면 실행을 함
		RemoteCon rc = tv;
//		rc = tv;
		rc.turnOn();
		rc.turnOff();
	}
}
