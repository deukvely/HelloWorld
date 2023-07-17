package co.yedam.student;

public class Student {
	// 필드
	private int studentNo;
	private String studentName;
	private int score;
	
	// 메소드(함수의 기능)
	// naming rule: 두 단어의 조합이면 두번째 단어의 첫번째 대문자 표기
	public void setStudentNo(int studentNo) {
		// 인스턴스를 가리키는 this
		this.studentNo = studentNo;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentName(String sn) {
		studentName = sn;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
}
