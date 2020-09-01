package ex.board.impl;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.board.BoardService;
import ex.board.BoardVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
          @Autowired
          private BoardDAOMybatis boardDAO;
         
       // �� ���
      	public void insertBoard(BoardVO vo) {
//      		if(vo.getSeq() == 0) {
//      			throw new IllegalArgumentException("0�� ���� ����� �� �����ϴ�.");
//      		}
      		boardDAO.insertBoard(vo);
      	}

      	// �� ����
      	public void updateBoard(BoardVO vo) {
      		boardDAO.updateBoard(vo);
      	}

      	// �� ����
      	public void deleteBoard(BoardVO vo) {
      		boardDAO.deleteBoard(vo);
      	}

      	// �� �� ��ȸ
      	public BoardVO getBoard(BoardVO vo) {
      		return boardDAO.getBoard(vo);
      	}

      	// �� ��� ��ȸ
      	public List<BoardVO> getBoardList(BoardVO vo){
      		return boardDAO.getBoardList(vo);
      	}
}
