package co.yedam;

public class Ex03 {
	public static void main(String[] args) {
		int[] arr = new int[5];

		int max = 0;
		int min = 11;
		for (int i = 0; i < 5; i++) {
			int value = (int) (Math.random() * 10) * 1 + 1;

			arr[i] += value;
			
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n최대값: " + max + " 최소값: " + min);
	}
}
