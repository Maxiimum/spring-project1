package open.sesame.dao;

import java.util.List;
import java.util.Map;

import open.sesame.dto.Board;

public interface BoardDAO {
	
	int insertBoard(Board board);
	int updateBoard(Board board);
	int updateClickCount(int boardNo);
	int deleteBoard(int boardNo);
	int selectBoardCount();
	int freeBoardCount();
	int teamBoardCount();
	int noticeBoardCount();
	List<Board> selectBoardList(Map<String, Object> map);
	List<Board> selectFreeBoardList(Map<String, Object> map);
	List<Board> selectTeamBoardList(Map<String, Object> map);
	List<Board> selectNoticeBoardList(Map<String, Object> map);
	List<Board> searchBoardList(String keyword);
	Board selectBoardNo(int boardNo);
	Board selectBoardCate(int boardNo);

}
