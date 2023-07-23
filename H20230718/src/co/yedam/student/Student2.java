package co.yedam.student;

public class Student2 {

	String stdNo;
	String stdName;
	int score;
	double height;
	
	Student2(){
		
	}

	public Student2(String stdNo, String stdName, int score, double height) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.score = score;
		this.height = height;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
