package co.yedam;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("num1>> ");
		int num1 = Integer.parseInt(scn.nextLine());

		System.out.print("num2>> ");
		int num2 = Integer.parseInt(scn.nextLine());

		int num3 = 0;

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					num3 += i;
				}
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0 || i % 3 == 0) {
					num3 += i;
				}
			}
		}
		System.out.println(num3);

	}
}
