package co.yedam.test;

import java.io.Serializable;

public class Board  implements Serializable {
	
	BoardApp app = new BoardApp();
	int no;
	String title;
	String content;
	String writer;
	String date;

	public Board() {
		app.readFromFile();
	}

	public Board(int no, String content) {
		this.no = no;
		this.content = content;
	}

	public Board(int no, String title, String content, String writer, String date) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + //
				", content=" + content + ", writer=" + writer//
				+ ", date=" + date + "]";
	}
}
