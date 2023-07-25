package co.yedam.board;

public class Board {
	private int no;
	private String title;
	private String content;
	private String id;
	private String date;

	public Board() {

	}
	public Board(int no, String content) {
		super();
		this.no = no;
		this.content = content;
	}
	public Board(int no, String title, String content, String id, String date) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.id = id;
		this.date = date;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean add(Board board) {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString() {
		return "책번호: " + no + " 책제목: " + title + " 책내용: " +// 
					 content + " 아이디: " + id + " 날짜: " + date;

	}
}
