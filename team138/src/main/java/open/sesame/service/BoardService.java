package open.sesame.service;

import java.util.List;
import java.util.Map;

import open.sesame.dto.Board;

public interface BoardService {
	
	void addBoard(Board board);
	void modifyBoard(Board board);
	void modifyClickCount(int boardNo);
	void removeBoard(int boardNo);
	int getBoardCount();
	int getFreeBoardCount();
	int getTeamBoardCount();
	int getNoticeBoardCount();
	List<Board> getBoardList(Map<String, Object> map);
	List<Board> getFreeBoardList(Map<String, Object> map);
	List<Board> getTeamBoardList(Map<String, Object> map);
	List<Board> getNoticeBoardList(Map<String, Object> map);
	List<Board> getSearchBoardList(String keyword);
	Board getSelectBoardNo(int boardNo);
	Board getSelectBoardCate(int boardNo);

}
