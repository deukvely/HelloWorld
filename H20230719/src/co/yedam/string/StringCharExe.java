package co.yedam.string;

import java.io.UnsupportedEncodingException;

public class StringCharExe {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
//		byte[] bytes = "문자열".getBytes();
//		byte[] bytes = "문자열".getBytes(Charset charset);
//		
//		try {
//			byte[] bytes1 = "문자열".getBytes("EUC-kr");
//			byte[] bytes2 = "문자열".getBytes("UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			
//			
//		}
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련없는 책이군요.");
		}
	}
}
