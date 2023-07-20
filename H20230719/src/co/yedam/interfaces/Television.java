package co.yedam.interfaces;

// RemoteCon 인터페이스 구현하는 클래스
// RemoteCon 인터페이스 클래스를 정의해줘야 됨
public class Television implements RemoteCon {
	int channel;

	public Television() {

	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void turnOn() {
		System.out.println("Audio 전원 on");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio 전원 off");

	}

}
