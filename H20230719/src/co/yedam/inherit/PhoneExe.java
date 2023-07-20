package co.yedam.inherit;

public class PhoneExe {
	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone();
		cellPhone.setModel("Galaxy S10");
		cellPhone.setColor("White");
		cellPhone.powerOn();
		cellPhone.sendMessage();
		cellPhone.powerOff();
		System.out.println(cellPhone.showInfo());
		
		System.out.println("-----------------------");
		// 자식클래스는 부모클래스의 필드 메소드 다 쓸 수 있음
		DmbCellPhone dmbPhone = new DmbCellPhone();
		dmbPhone.setModel("Galaxy Dm 1");
		dmbPhone.setColor("Yellow");
		dmbPhone.powerOn();
		dmbPhone.sendMessage();
		dmbPhone.turnOn();
		dmbPhone.changeChannel(10);
		dmbPhone.turnOff();
		dmbPhone.powerOff();
		System.out.println(dmbPhone.showInfo());
		
		// 변수클래스이 변수에 자식클래스의 변수 대입
		// CellPhone 부모클래스를 DmbPhone 자식클래스로 인스턴스 만들어 사용
		// 자식클래스의 인스턴스 값을 부모클래스를 할당
		CellPhone parent = new DmbCellPhone("DMB S22", "White", 10);
//		parent.turnOn(); // 자식클래스만 가지고 있는 필드, 메소드 사용 불가
		System.out.println(parent.getModel());
		// 자식클래스만 가지고 있는 필드 메소드를 쓸려면 강제 형변환으로 사용 가능
		
		DmbCellPhone child = null;
		
		if(cellPhone instanceof DmbCellPhone) {
			child = (DmbCellPhone) parent; // casting
//			child.turnOn();
		}
		// 부모클래스의 변수를 자식변수로 casting 할 경우 체크.
		if(cellPhone instanceof DmbCellPhone) {
			child = (DmbCellPhone) cellPhone;
			child.turnOn();			
		}
	}
}
