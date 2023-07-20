package co.yedam.interfaces;

// 인터페이스
// 생성자(x), 필드(O): 상수의 용도로만 사용/ 값이 할당되면 변하지 않는 것
//					메소드: 추상메소드로 선언
// Remote 객체로만 선언하고 싶을 때 사용
public interface RemoteCon {
	// final: 값이 정해지면 바뀌지 않음
	final int CHANNEL = 10;
	
	abstract void turnOn();
	void turnOff();
}
