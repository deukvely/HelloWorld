package co.yedam.friends;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		
		// 1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료
		// 등록> 1.학교, 2.회사, 3.친구
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		// Friend <- CompFriend, UnivFriend.
		AddressApp app = new AddressApp();
		Friend[] friends = new Friend[10];
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.단건조회 6.종료");
			int memu = Integer.parseInt(scn.nextLine());
			if(memu == 1) {
				System.out.println("1.회사 2.학교 3.친구");
				int who = Integer.parseInt(scn.nextLine());
				if(who == 1) {
					System.out.print("이름 번호 회사명 부서명");
					String name = scn.next();					
					String phone = scn.next();
					String company = scn.next();					
					String dept = scn.next();
					scn.nextLine();
					
					if(app.addFriend(new CompFriend(name, phone, company, dept))) {
						System.out.println("정상적으로 등록되었습니다.");
					} else {
						System.out.println("등록이 안 되었습니다.");
					}
					
					
				} else if(who == 2) {
					System.out.print("이름 번호 대학명 학과명");
					String name = scn.next();					
					String phone = scn.next();
					String univ = scn.next();					
					String major = scn.next();
					scn.nextLine();
					
					if(app.addFriend(new UnivFriend(name, phone, univ, major))) {
						System.out.println("정상적으로 등록되었습니다.");
					} else {
						System.out.println("등록이 안 되었습니다.");
					}
				} else if(who == 3) {
					System.out.print("이름 전화번호");
					String name = scn.next();					
					String phone = scn.next();
					scn.nextLine();
					
					if(app.addFriend(new Friend(name, phone))) {
						System.out.println("정상적으로 등록되었습니다.");
					} else {
						System.out.println("등록이 안 되었습니다.");
					}
				}
				
			} else if(memu == 2) {
				System.out.print("찾을 번호");
				String findNo = scn.nextLine();
				
				if(app.addFriend(new Friend())) {
					
				}
			} else if(memu == 3) {
				
			} else if(memu == 4) {
				
			} else if(memu == 5) {
				
			} else if(memu == 6) {
				System.out.println("종료");
				run = false;
			}
			
		}
		
		
//		friends 배열에 Friends 클래스의 인스턴스 대입
//		friends[0] = new Friends("홍길동", "010-1111");
//		friends[1] = new CompFriend("김길동", "010-2222", "네이버", "개발부서");
//		friends[2] = new UnivFriend("박길동", "010-2222", "대구대학교", "정보통신");
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println(friends[i].showInfo());
//		}	
	}
}
