package co.yedam;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("num1>> ");
		int num1 = Integer.parseInt(scn.nextLine());
		
		System.out.print("num2>> ");
		int num2 = Integer.parseInt(scn.nextLine());
		
		int max = 0;
		
		if (num1 > num2) {
			max = num1;
		}
		else {
			max = num2;
		}
		System.out.println("큰 값: " + max);
	}
}