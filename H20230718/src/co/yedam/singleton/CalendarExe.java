package co.yedam.singleton;

import java.util.Calendar;
import java.util.Scanner;
public class CalendarExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("input>>>");
		String str;
		// 1001 홍길동 80 엔터
		String no = scn.next();
		String name = scn.next();
		String score = scn.next();
		System.out.println(no+" "+ name+" "+score);
		
		showCal(2022, 8);
	}

	public static void showCal(int year, int month) {
		System.out.println(Calendar.MONTH);
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		System.out.println("년도: " + cal.get(Calendar.YEAR));
		System.out.println("월: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("날짜: " + cal.get(Calendar.DATE));
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("말일: " + cal.getActualMaximum(Calendar.DATE));

		// coding here... 달력그리기
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		System.out.println(month + "월");
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		// 공란
		int pos = getFirstDay(month);
		System.out.println();
		for (int i = 0; i < pos; i++) {
			System.out.printf("%4s", "");
		}

		int lastDate = getLastDate(month);
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + pos) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	// 월 정보를 입력하면 해당 월의 1일의 위치(공란을 반환)
	public static int getFirstDay(int month) {
		int pos = 1;

		switch (month) {
		case 1:
		case 10:
			pos = 0;
			break;
		case 2:
		case 3:
		case 11:
			pos = 3;
			break;
		case 5:
			pos = 1;
			break;
		case 6:
			pos = 4;
			break;
		case 4:
		case 7:
			pos = 6;
			break;
		case 8:
			pos = 2;
			break;
		case 9:
		case 12:
			pos = 5;
			break;

		}
		return pos;
	}

	// 월 정보를 입력하면 해당 월의 마지막 날을 반환.
	public static int getLastDate(int month) {
		int lastDate = 31;
		switch (month) {
		case 2:
			lastDate = 28;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDate = 31;
			break;
		default:
			lastDate = 30;
			break;
		}
		return lastDate;
	}
}
