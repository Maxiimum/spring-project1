package open.sesame.mapper;

import java.util.List;
import java.util.Map;

import open.sesame.dto.Board;

public interface BoardMapper {
	
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
