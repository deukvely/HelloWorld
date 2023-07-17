package co.yedam.Board;

public class Board {
	
	private int textNo;
	private String textHead;
	private String textCon;
	private String textName;
	
	public Board() {		
	}
	public int getTextNo() {
		return textNo;
	}
	public void setTextNo(int textNo) {
		this.textNo = textNo;
	}
	public String getTextHead() {
		return textHead;
	}
	public void setTextHead(String textHead) {
		this.textHead = textHead;
	}
	public String getTextCon() {
		return textCon;
	}
	public void setTextCon(String textCon) {
		this.textCon = textCon;
	}
	public String getTextName() {
		return textName;
	}
	public void setTextName(String textName) {
		this.textName = textName;
	}	
	public Board(int textNo, String textHead, String textCon, String textName) {
		super();
		this.textNo = textNo;
		this.textHead = textHead;
		this.textCon = textCon;
		this.textName = textName;
	}
	public String all() {
		return "글번호: " + textNo + " 글제목: " + textHead + " 글내용: " + textCon + " 작성자: " + textName;
	}
}
	