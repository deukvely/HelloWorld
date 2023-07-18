package co.yedam.memo;

public class Memo {
	String no;
	String content;
	String date;
	Memo[] mm = new Memo[10];
	Memo(){
		
	}
	
	public Memo(String no, String content, String date) {
		super();
		this.no = no;
		this.content = content;
		this.date = date;
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String showInfo() {
		return "번호: " + no + "내용: " + content + "날짜: " + date;
	}
}
