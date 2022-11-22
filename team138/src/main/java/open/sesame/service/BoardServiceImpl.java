package open.sesame.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import open.sesame.dao.BoardDAO;
import open.sesame.dto.Board;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private final BoardDAO boardDAO;
	
	@Transactional
	@Override
	public void addBoard(Board board) {
		boardDAO.insertBoard(board);
		
	}

	@Transactional
	@Override
	public void modifyBoard(Board board) {
		boardDAO.updateBoard(board);
	}

	@Transactional
	@Override
	public void removeBoard(int boardNo) {
		boardDAO.deleteBoard(boardNo);
	}

	@Transactional
	@Override
	public List<Board> getSearchBoardList(String keyword) {
		return boardDAO.searchBoardList(keyword);
	}

	@Transactional
	@Override
	public int getBoardCount() {
		return boardDAO.selectBoardCount();
	}

	@Transactional
	@Override
	public List<Board> getBoardList(Map<String, Object> map) {
		return boardDAO.selectBoardList(map);
	}

	@Override
	public Board getSelectBoardNo(int boardNo) {
		return boardDAO.selectBoardNo(boardNo);
	}

	@Override
	public int getFreeBoardCount() {
		return boardDAO.freeBoardCount();
	}

	@Override
	public int getTeamBoardCount() {
		return boardDAO.teamBoardCount();
	}

	@Override
	public int getNoticeBoardCount() {
		return boardDAO.noticeBoardCount();
	}

	@Override
	public List<Board> getFreeBoardList(Map<String, Object> map) {
		return boardDAO.selectFreeBoardList(map);
	}

	@Override
	public List<Board> getTeamBoardList(Map<String, Object> map) {
		return boardDAO.selectTeamBoardList(map);
	}

	@Override
	public List<Board> getNoticeBoardList(Map<String, Object> map) {
		return boardDAO.selectNoticeBoardList(map);
	}

	@Transactional
	@Override
	public void modifyClickCount(int boardNo) {
		boardDAO.updateClickCount(boardNo);
		
	}

	@Override
	public Board getSelectBoardCate(int boardNo) {
		return boardDAO.selectBoardCate(boardNo);
	}

}
