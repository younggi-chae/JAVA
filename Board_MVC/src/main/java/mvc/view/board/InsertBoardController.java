package mvc.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;
import mvc.view.controller.Controller;

public class InsertBoardController implements Controller {
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("�� ��� ó��");
		
		// 1. ����� �Է� ���� ����
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//2. DB ���� ó��
		BoardDTO dto = new BoardDTO();
		dto.setTitle(title);
		dto.setWriter(writer);
		dto.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.insertBoard(dto);
		
		//3. ȭ�� �׺���̼�
		return "getBoardList.do";
	}

}
