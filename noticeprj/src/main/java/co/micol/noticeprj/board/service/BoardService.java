package co.micol.noticeprj.board.service;

import java.util.List;

public interface BoardService {
	public List<BoardVO> boardSelectList(); // R

	public BoardVO boardSelect(BoardVO vo); // R

	public int boardInsert(BoardVO vo); // C

	public int boardDelete(BoardVO vo); // D

	public int boardUpdate(BoardVO vo); // U
}
