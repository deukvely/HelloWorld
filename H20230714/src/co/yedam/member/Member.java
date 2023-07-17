package co.yedam.member;

public class Member {
	// 회원번호, 이름, 연락처, 성별, 주소
	private int memberNo;
	private String memberName;
	private String phone;
	private Gender gender;
	private String address;
	
	// 생성자: 필드의 초기값을 지정.
	// 기본생성자 생성.
	public Member() {
//		this.memberNo = 2001;
//		this.memberName = "황찬희";
//		this.phone = "010=1234";
	}
	// source -> -- using fields 누르면 생성자 만들어짐
	public Member(int memberNo, String memberName, String phone, Gender gender, String address) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
	}

	public Member(int memberNo, String memberName) {
		this.memberNo = memberNo;
		this.memberName = memberName;
	}
	
	// source -> getter and setter 누르면 메소드 만들어짐
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 회원의 간략한 정보 출력
	public String showInfo() {
		return "회원번호: " + memberNo + ", 회원명: " + memberName + ", 연락처: " + phone;
	}
	
	// 회원의 전체 정보 출력
	public String detailInfo() {
		String result = showInfo();
		result += ", 성별: " + gender + ", 주소: " + address;
		return result;
	}
}
