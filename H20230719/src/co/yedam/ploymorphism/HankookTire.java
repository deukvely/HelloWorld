package co.yedam.ploymorphism;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
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
