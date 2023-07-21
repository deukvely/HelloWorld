package co.yedam.collect.board;

import java.util.ArrayList;
import java.util.List;
// 기능 페이지
public class BoardApp {
	static // 게시물저장.
	List<Board> boards = new ArrayList<>();
	
	BoardApp() {
		
	}
	
	boolean addBoard(Board board) {
		return boards.add(board);
	}

	List<Board> boardList() {
		return boards;
	}

	Board getBoard(int boardNo) {
		for(int i = 0; i < boards.size(); i++) {
			
			if(boards.get(i).getBoardNo() == boardNo) {
				return boards.get(i);
			}
		}
		return null;
	}

	boolean delBoard(int boardNo) {
		return false;
	}
}
