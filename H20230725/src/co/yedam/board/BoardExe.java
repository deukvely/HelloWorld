package co.yedam.board;

import java.util.ArrayList;
import java.util.List;

public class BoardExe {
	List<Board> boards = new ArrayList<>();

	BoardExe() {

	}

	boolean addBoard(Board board) {
		if (boards.add(board)) {
			return true;
		}
		return false;
	}

	boolean editBoard(int no, String content) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				boards.get(i).setContent(content);
				return true;
			}
		}
		return false;
	}

	boolean delBoard(int no) {
		for (int i = 0; i < boards.size(); i++) {
			if (boards.get(i).getNo() == no) {
				boards.remove(i);
				return true;
			}
		}
		return false;
	}
	
	List<Board> boardList(){
		return boards;
	}
}
