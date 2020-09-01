package mvc.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.board.BoardDTO;
import mvc.board.impl.BoardDAO;

@Controller
public class BoardController {

	// �۵��
	@RequestMapping(value = "/insertBoard.do")
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
	public ModelAndView getBoard(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav) {

		System.out.println("�� �� ��ȸ ó��");

		mav.addObject("board", boardDAO.getBoard(dto));
		mav.setViewName("getBoard.jsp");
		return mav;
	}

	// �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardDTO dto, BoardDAO boardDAO, ModelAndView mav) {

		System.out.println("�� ��� �˻� ó��");

		mav.addObject("boardList", boardDAO.getBoard(dto)); // �� ���� ����
		mav.setViewName("getBoardList.jsp"); // �� ���� ����
		return mav;
	}
}
