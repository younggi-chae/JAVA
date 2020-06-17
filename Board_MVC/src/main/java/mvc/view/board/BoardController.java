package mvc.view.board;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;

@Controller
public class BoardController {

		
	// �۵��
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDTO dto, BoardDAO boardDAO) {

		System.out.println("�� ��� ó��");

		boardDAO.insertBoard(dto);
		return "getBoardList.do";
	}
 
	// �ۼ���
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardDTO dto, BoardDAO boardDAO) {

		System.out.println("�� ���� ó��");

		boardDAO.updateBoard(dto);
		return "getBoardList.do";
	}

	// �ۻ���
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardDTO dto, BoardDAO boardDAO) {

		System.out.println("�� ���� ó��");
		boardDAO.deleteBoard(dto);
		return "getBoardList.do";
	}

	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDTO dto, BoardDAO boardDAO, Model model) {

		System.out.println("�� �� ��ȸ ó��");
		
		model.addAttribute("board", boardDAO.getBoard(dto));
		return "getBoard.jsp";
		
	}

	// �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardDTO dto, BoardDAO boardDAO, Model model) {

		System.out.println("�� ��� �˻� ó��");

		model.addAttribute("boardList", boardDAO.getBoardList(dto));
		return "getBoardList.jsp";
	}
}
