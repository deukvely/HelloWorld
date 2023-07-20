package co.yedam.ploymorphism;

// 상속관계 : Tire <- HankookTire, KumhoTire
public class Tire {
	// 필드.
	int maxRotation; // 최대 사용가능한 회전수
	int accumulatedRotation; // 사용한 회전수
	String location; // 타이어 위치

	// 생성자.
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드.
	public boolean roll() {
		accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + " HankookTire 수명: " + //
					(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
