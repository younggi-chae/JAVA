package mvc.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.board.BoardDTO;

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
	
	public List<BoardDTO> getBoardList(BoardDTO dto) {
		System.out.println("===> Mybatis�� getBoardList() ��� ó��");
		return mybatis.selectList("BoardDAO.getBoardList", dto);
	}
	
	public void updateCnt(BoardDTO dto) {
		mybatis.update("BoardDAO.updateCnt", dto);				
	}
}
