package co.yedam;

public class ForAndForExe {
	public static void main(String[] args) {
		practice4();
		forAndFor();
	}
	public static void practice3() {
		
	}
	public static void practice4() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				if(4*i+5*j==60) {
					System.out.println("(4 X "+i  + ") + (5 X "+ j +") = 60 (x = "+ (i+" , y = "+j)+")");
				}
			}
		}
	}
	public static void forAndFor() {
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 10; i++) {
				System.out.printf("%d x %d = %2d  ", i, j,(i*j));
				
			} 
			System.out.println();
		}
	}
}
