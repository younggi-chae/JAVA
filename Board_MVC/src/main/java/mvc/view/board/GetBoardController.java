package mvc.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;
import mvc.view.controller.Controller;

public class GetBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("�� �� ��ȸ ó��");
		
		// 1. �˻��� �Խñ� ��ȣ ����
		String seq = request.getParameter("seq");
		
		// 2. DB ���� ó��
		BoardDTO dto = new BoardDTO();
		dto.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		BoardDTO board = boardDAO.getBoard(dto);
		
		//3. �˻� ����� ���ǿ� �����ϰ� �� ȭ������ �̵��Ѵ�.
		HttpSession session = request.getSession();
		session.setAttribute("board", board);
		return "getBoard";
	}
}
