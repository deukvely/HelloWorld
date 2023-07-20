package co.yedam.interfaces;

// remotoCon 인터페이스를 구현하는 클래스로 만들고 싶을 때(구현 클래스)
// 구현할 클래스 implements 인터페이스 클래스
public class Audio implements RemoteCon {
	double freq;

	public Audio() {

	}

	public void setFreq(double freq) {
		this.freq = freq;
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 전원 on");
	}

	@Override
	public void turnOn() {
		System.out.println("Audio 전원 off");
	}
}
