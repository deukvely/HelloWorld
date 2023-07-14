package co.yedam.reference;

public class IntArrayExe {
	public static void main(String[] args) {
		int[] intAry = null;
		intAry = new int[] { 10,20,30 }; // 정수형 배열 3개 크기
		intAry = new int[5]; // 정수형 배열 공간 5개 크기.
		
		intAry[0] = 15;
		intAry[intAry.length - 1] = 55;
		System.out.println(intAry[intAry.length - 1]);
		int sum = 0;
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
			sum += intAry[i];
		}
		System.out.println("sum: " + sum);
		// 확장 for
		for(int num : intAry) {
			System.out.println(num);
			sum += num;
		}
		System.out.println("sum: " + sum);
		
		// 정수를 저장할 수 있는 배열 scores.
		// 학생 1 ~ 학생 5: 80, 85, 77, 93, 100
		// 학생 점수의 합과 평균
		int[] stu = {88, 85, 77, 93, 100};
		int hap = 0;
		for(int num : stu) {
			hap += num;
		}
		double avg = (double)hap / stu.length;
		System.out.println("합 : "+hap+" 총점 : "+ avg);
	}
}
