package co.yedam;

public class LoopExample {
	public static void main(String[] args) {
		
	// 76800원 > 5만원:1장, 1만원:2장, 5천원:1장, 1천원:1장, 5백원:1개, 1백원:3개
//	int value = 76800;
	
	int value = ((int) (Math.random() * 50000 / 100))* 100 + 50000;
	int paper = 0;
	String w = "";
	int re = 0;
	int[] arr = {50000, 10000, 5000, 1000, 500, 100};
	for(int i = 0; 0 < value; i++) {
		paper = value / arr[i];
		re = value - paper * arr[i];
		w += arr[i] + " 원 " + paper+" 장 ";
		value = re;
	}
	System.out.println(w);
//	System.out.println(value);
//	System.out.println("76,800원은 5만원 1장, 1만원 2장, 5천원 1장,....");
	}
}
