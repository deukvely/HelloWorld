package co.yedam.memo;

public class Memo2 {
	String number;
	String content;
	String date;

	public Memo2() {

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public Memo2(String number, String content, String date) {
		super();
		this.number = number;
		this.content = content;
		this.date = date;
	}
}
