package co.yedam;

public class ConditionExe {
	public static void main(String[] args) {
		int score = 88;
		
		// 90 이상이면 A
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else{
			System.out.println("D");
		}
		
		switch(score / 10) {
		case 9:
			System.out.println("A");
			break;
		
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
	}
}
