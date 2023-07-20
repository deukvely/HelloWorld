package co.yedam.abstracts;

public class SmartPhone extends Phone {
	
	// 생성자 존재해야 함.
	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트폰의 전원 on");
	}
	
	@Override
	public void powerOff() {
		System.out.println("스마트폰의 전원 off");		
	}
	
	public void internetSearch() {
		System.out.println("검색기능");
	}
}
