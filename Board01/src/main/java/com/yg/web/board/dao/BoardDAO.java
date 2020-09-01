package com.yg.web.board.dao;

import java.util.List;

import com.yg.common.Pagination;
import com.yg.common.Search;
import com.yg.web.board.model.BoardDTO;

public interface BoardDAO {
	 
	public List<BoardDTO> getBoardList(Search search) throws Exception;

	public BoardDTO getBoardContent(int bid) throws Exception;
	
	public int insertBoard(BoardDTO boardDTO) throws Exception;
	
	public int updateBoard(BoardDTO boardDTO) throws Exception;
	
	public int deleteBoard(int bid) throws Exception;
	
	//��ȸ��
	public int updateViewCnt(int bid) throws Exception;
	
	//�� �Խñ� ���� Ȯ��
	public int getBoardListCnt(Search search) throws Exception;

}
