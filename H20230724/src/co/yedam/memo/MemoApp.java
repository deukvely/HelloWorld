package co.yedam.memo;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) throws Exception {
	
		Scanner scn = new Scanner(System.in);
		MemoManager manager = new MemoManager();
		boolean run = true;
		int menu = -1;

		while (run) {
			manager.printMenu();
			menu = Integer.parseInt(scn.nextLine());

			if (menu == 1) {
				manager.inputData();
			} else if (menu == 2) {
				manager.searchDate();
			} else if (menu == 3) {
				manager.deleteData();
			} else if (menu == 4) {
				manager.storeToFile();
				run = false;
			}
		}
//		System.out.println("end of prog");
//		scn.close();
	}
}
