package mvc.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;
import mvc.view.controller.Controller;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("�� ���� ó��");

		String seq = request.getParameter("seq");

		BoardDTO dto = new BoardDTO();
		dto.setSeq(Integer.parseInt(seq));

		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(dto);

		return "getBoardList.do";
	}
}