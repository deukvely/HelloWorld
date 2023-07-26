package co.yedam.score;

import java.io.Serializable;

public class Score implements Serializable {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	public Score() {

	}

	public Score(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "학번은 " + no + " 이름은 " + name + " 국어는 " + kor + //
				"점 영어는 " + eng + "점 수학은 " + math + "점";
	}

}
