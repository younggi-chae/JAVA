package mvc.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.board.BoardDTO;
import mvc.board.ReplyDTO;
import mvc.common.Search;

@Repository
public class BoardDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardDTO dto) {
		System.out.println("===> Mybatis�� insertBoard() ��� ó��");
		mybatis.insert("BoardDAO.insertBoard", dto);
	}
	
	public void updateBoard(BoardDTO dto) {
		System.out.println("===> Mybatis�� updateBoard() ��� ó��");
		mybatis.update("BoardDAO.updateBoard", dto);
	}
	
	public void deleteBoard(BoardDTO dto) {
		System.out.println("===> Mybatis�� deleteBoard() ��� ó��"); 
		mybatis.delete("BoardDAO.deleteBoard", dto);
	}
	
	public BoardDTO getBoard(BoardDTO dto) {
		System.out.println("===> Mybatis�� getBoard() ��� ó��");
		return (BoardDTO) mybatis.selectOne("BoardDAO.getBoard", dto);
	}
	
	public List<BoardDTO> getBoardList(Search search) {
		System.out.println("===> Mybatis�� getBoardList() ��� ó��");
		return mybatis.selectList("BoardDAO.getBoardList", search);
	}
	
	public void updateCnt(BoardDTO dto) {
		mybatis.update("BoardDAO.updateCnt", dto);				
	}
	
	public int getBoardListCnt(Search search) {
		return mybatis.selectOne("BoardDAO.getBoardListCnt", search);
	}	
	
	public List<ReplyDTO> getReplyList(int bid) {
		return mybatis.selectList("replyMapper.getReplyList", bid);
	}

	public int saveReply(ReplyDTO replyDTO) {
		return mybatis.insert("replyMapper.saveReply", replyDTO);
	}

	public int updateReply(ReplyDTO replyDTO) {
		return mybatis.update("replyMapper.updateReply", replyDTO);
	}

	public int deleteReply(int rid) {
		return mybatis.delete("replyMapper.deleteReply", rid);
	}		
}
