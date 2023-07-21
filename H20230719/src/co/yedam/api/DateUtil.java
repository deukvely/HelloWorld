package co.yedam.api;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateUtil {
	public static String dateToStr(Date date) {
		// Date -> String 생성.
		SimpleDateFormat sdf = //
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(date);
	}
	
	public static String dateToStr(Date today, String pattern) {
		// Date -> String 생성.
		SimpleDateFormat sdf = //
				new SimpleDateFormat(pattern);
		return sdf.format(today);
	}

	public static void strToDate(String string) {
		// TODO Auto-generated method stub
		
	}

	public static String dateToStr(java.util.Date today, String pattern) {
		// TODO Auto-generated method stub
		return null;
	}
}
