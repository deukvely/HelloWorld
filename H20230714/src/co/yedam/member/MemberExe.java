package co.yedam.member;

import java.util.Scanner;

public class MemberExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		Member[] members = new Member[10];
		
		// 초기데이터 저장
		Member m1 = new Member();
		m1.setMemberNo(1001);
		m1.setMemberName("홍길동");
		m1.setPhone("010-3333");
		m1.setGender(Gender.WOMEN);
		m1.setAddress("대구");
		
		Member m2 = new Member();
		m2.setMemberNo(1002);
		m2.setMemberName("김길동");
		m2.setPhone("010-5555");
		m2.setGender(Gender.MEN);
		m2.setAddress("부산");
		members[0] = m1; 
		members[1] = m2;
		
		Member m3 = new Member();
		members[2] = m3;
		
		Member m4 = new Member(3001,"park","010-2132", Gender.WOMEN, "인천");
		members[3] = m4;
		
		while(run) {
			System.out.println("1.등록 2.목록 3.수정 4.삭제 5.상세조회 6.남자회원목록 7.종료");
			System.out.println("선택>> ");
			int menu = Integer.parseInt(scn.nextLine());
				
			if (menu == 1) {
				System.out.println("등록기능.");
				System.out.print("회원번호입력> ");
				int mNo = Integer.parseInt(scn.nextLine());
				
				System.out.print("회원이름입력>");
				String mname = scn.nextLine();
				
				System.out.print("회원연락처입력>");
				String phone = scn.nextLine();
				
				System.out.print("회원성별입력>");
				//남, 남
				Gender gender = null;
				String temp = scn.nextLine();
				if(temp.startsWith("남")) {
					gender = Gender.MEN;
				} else if(temp.startsWith("여")) {
					gender = Gender.WOMEN;
				}
				System.out.print("회원주소입력>");
				String addr = scn.nextLine();
				
				Member member = new Member(); // 인스턴스.
				member.setMemberNo(mNo);			
				member.setMemberName(mname);
				member.setPhone(phone);
				member.setGender(gender);
				member.setAddress(addr);
				

		
				// members 멤버 인스턴스 10개 저장.
				for (int i = 0; i < members.length; i++) {
					if (members[i] == null) {
						members[i] = member; // 배열의 빈값에 저장.
						break; // 한건 저장 후 반복문 종
					}
				}
				
			} else if (menu == 2) {
				System.out.println("목록기능.");
				for (int i = 0; i < members.length; i++) {
					if (members[i] != null) {
						System.out.println(members[i].showInfo());
					}
				}
				
			} else if (menu == 3) {
				boolean isExist = false; // 조회결과 존재 여부 체크
				System.out.println("수정기능.");
				System.out.print("회원번호입력> ");
				int mNo = Integer.parseInt(scn.nextLine());
				for(int i = 0; i < members.length; i++) {
					// 배열의 값 중에서 null 여부 체크.
					if(members[i] != null && members[i].getMemberNo() == mNo) {
						isExist = true;
					}
				}
				if (isExist == false) {
					System.out.println("찾는 회원 없음");
					continue;
				}
				
				System.out.print("번호수정>");
				String tel = scn.nextLine();
				
				for(int i = 0; i < members.length; i++) {
					// 배열의 값 중에서 null 여부 체크.
					if(members[i] != null && members[i].getMemberNo() == mNo) {
						members[i].setPhone(tel);
						System.out.println("번호 완료되었습니다.");
					}
				}			
			} else if (menu == 4) {
				boolean isExist = false; // 조회결과 존재 여부 체크
				System.out.println("삭제기능.");
				System.out.print("회원번호입력> ");
				int no = Integer.parseInt(scn.nextLine());
				for(int i = 0; i < members.length; i++) {
					// 배열의 값 중에서 null 여부 체크.
					if(members[i] != null && members[i].getMemberNo() == no) {
						// 널이 되면 삭제됨
						members[i] = null;
						System.out.println("삭제 완료되었습니다.");
						// 변경 후 반복문 종료
						isExist = true;
						break;
					}
				}
				if(isExist == false) {
					System.out.println("찾는 회원 없음");
				}
			} else if (menu == 5) {
				boolean isExist = false; // 조회결과 존재 여부 체크
				System.out.println("상세조회기능.");
				System.out.println("회원번호입력>> ");
				int no = Integer.parseInt(scn.nextLine());
				
				for(int i = 0; i < members.length; i++) {
					// 배열의 값 중에서 null 여부 체크.
					if(members[i] != null && members[i].getMemberNo() == no) {
						System.out.println(members[i].detailInfo());
						isExist = true;
					}
				}
				if (isExist == false) {
					System.out.println("찾는 회원 없음");
				}
			} else if (menu == 6) {
				for(int i = 0; i < members.length; i++) {
					// 배열의 값 중에서 null 여부 체크.
					if(members[i] != null && members[i].getGender() == Gender.MEN) {
						System.out.println(members[i].detailInfo());
					}
				}
				
			} else if (menu == 7) {
				System.out.println("종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog.");
	}
}
