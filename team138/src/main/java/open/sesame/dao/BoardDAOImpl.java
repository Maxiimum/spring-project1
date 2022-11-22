package open.sesame.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import open.sesame.dto.Board;
import open.sesame.mapper.BoardMapper;

@Repository
@RequiredArgsConstructor
public class BoardDAOImpl implements BoardDAO{
	
	private final SqlSession sqlSession;

	@Override
	public int insertBoard(Board board) {
		return sqlSession.getMapper(BoardMapper.class).insertBoard(board);
	}

	@Override
	public int updateBoard(Board board) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(BoardMapper.class).updateBoard(board);
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(BoardMapper.class).deleteBoard(boardNo);
	}

	@Override
	public List<Board> searchBoardList(String keyword) {
		// TODO Auto-generated method stub
		return sqlSession.getMapper(BoardMapper.class).searchBoardList(keyword);
	}

	@Override
	public int selectBoardCount() {
		return sqlSession.getMapper(BoardMapper.class).selectBoardCount();
	}

	@Override
	public List<Board> selectBoardList(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).selectBoardList(map);
	}

	@Override
	public Board selectBoardNo(int boardNo) {
		return sqlSession.getMapper(BoardMapper.class).selectBoardNo(boardNo);
	}

	@Override
	public int freeBoardCount() {
		return sqlSession.getMapper(BoardMapper.class).freeBoardCount();
	}

	@Override
	public int teamBoardCount() {
		return sqlSession.getMapper(BoardMapper.class).teamBoardCount();
	}

	@Override
	public int noticeBoardCount() {
		return sqlSession.getMapper(BoardMapper.class).noticeBoardCount();
	}

	@Override
	public List<Board> selectFreeBoardList(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).selectFreeBoardList(map);
	}

	@Override
	public List<Board> selectTeamBoardList(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).selectTeamBoardList(map);
	}

	@Override
	public List<Board> selectNoticeBoardList(Map<String, Object> map) {
		return sqlSession.getMapper(BoardMapper.class).selectNoticeBoardList(map);
	}

	@Override
	public int updateClickCount(int boardNo) {
		return sqlSession.getMapper(BoardMapper.class).updateClickCount(boardNo);
	}

	@Override
	public Board selectBoardCate(int boardNo) {
		return sqlSession.getMapper(BoardMapper.class).selectBoardCate(boardNo);
	}

}
