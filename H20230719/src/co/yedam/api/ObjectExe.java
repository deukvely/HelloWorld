package co.yedam.api;

public class ObjectExe {
	public static void main(String[] args) {
		String[] numbers = { "9802032234567", "0502033234567", //
				"980203-1234567", "050203 3323456" };
		// 주민번호 뒷자리의 첫번째 값(성별: 1, 3 남자/ 2, 4 여자)
		for (String num : numbers) {
			System.out.println(checkGender(num));
		}
	}

	static String checkGender(String no) {
		char cha;
		if (no.length() == 14 || no.length() == 13) {
			if (no.charAt(7) == no.charAt(6) && no.charAt(7) == '1' || no.charAt(7) == '3') {

				return "남자";
			}
			return "여자";
		} else if (no.length() == 14 || no.length() == 13) {
			if (no.charAt(7) == no.charAt(6) && no.charAt(7) == '2' || no.charAt(7) == '4') {
				return "여자";
			}
			return "남자";
		} else {
			
		}
		return "에러";
	}
//			if (cha == '1' || cha == '3') {
//				return "성별: 남자";
//			} else if (cha == '2' || cha == '4') {
//				return "성별: 여자";
//			} else {
//				return "에러";
//			}
//			switch(cha) {
//			case '1':
//			case '3':
//				System.out.println("남자");
//				break;
//			case '2':
//			case '4':
//				System.out.println("여자");
//				break;
//			default:
//				System.out.println("에러");
//			}
//		}
//	if(no.length()==13)
//
//	{
//		cha = no.charAt(6);
//		if (cha == '1' || cha == '3') {
//			return "성별: 남자";
//		} else if (cha == '2' || cha == '4') {
//			return "성별: 여자";
//		} else {
//			return "에러";
//		}
//	}return"남"; // 남, 여, 에러
//}

//		Object obj1 = new Object();
//		Object obj2 = new Object();
//		boolean result = obj1.equals(obj2);
//		System.out.println(result);
//		
//		Member mem1 = new Member(1001, "홍길동");
//		Member mem2 = new Member(1002, "감길동");
//		result = mem1.equals(mem2);
//		System.out.println(result);
//		
//		Set<Member> set = new HashSet<>();
//		// 논리적으로 동등한 객체임을 판별할 때
//		// hashCode, equals 정의
//		set.add(new Member(1001, "홍길동"));
//		set.add(new Member(1002, "감길동"));
//		set.add(new Member(1003, "미길동"));
//		set.add(new Member(1001, "홍길동"));
//		
//		for (Member str : set) {
//			System.out.println(str.toString());
//		}
//		
//	}
//	
//	public static void printRect() {
//		// 1
//		// 2 3
//		// 4 5 6
// 		// 7 8 9 10
//		int cnt = 1;
//		String jump = null;
//		for (int i = 1; i <= 4; i++) {
//			System.out.println(" ");
//			for (int j = 0; j < i; j++) {				
//				System.out.print(cnt++ +" ");		
//			}
//		}		
//	}
}
