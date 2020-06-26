package mvc.view.board;


import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import mvc.board.BoardDTO;
import mvc.board.BoardService;
import mvc.common.Search;

@Controller
@SessionAttributes("board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	 
	// �۵��
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDTO dto) throws IOException {
		
		MultipartFile uploadFile = dto.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("C:/" + fileName));
		}
		boardService.insertBoard(dto);
		return "getBoardList.do";
	}
 
	// �ۼ���
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardDTO dto) {
		boardService.updateBoard(dto);
		return "getBoardList.do";
	}

	// �ۻ���
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardDTO dto) {

		System.out.println("�� ���� ó��");
		boardService.deleteBoard(dto);
		return "getBoardList.do";
	}

	// �� �� ��ȸ
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDTO dto, Model model) {

		System.out.println("�� �� ��ȸ ó��");
		boardService.updateCnt(dto);
		model.addAttribute("board", boardService.getBoard(dto));
		return "getBoard.jsp";		
	}

	// �� ��� �˻�
	@RequestMapping("/getBoardList.do")
	public String getBoardList(Model model
			,@RequestParam(required=false, defaultValue="1") int page
	        ,@RequestParam(required=false, defaultValue="1") int range
	        ,@RequestParam(required=false, defaultValue="TITLE") String searchType
	        ,@RequestParam(required=false) String keyword
	        ,@ModelAttribute("search") Search search) {		
		
		//�˻�
		model.addAttribute("search", search);
		search.setSearchType(searchType);
		search.setKeyword(keyword);
		
		//��ü �Խñ� ��
		int listCnt = boardService.getBoardListCnt(search);
		//�˻�
		search.pageInfo(page, range, listCnt);	
		
		//�� ���� ����			
		model.addAttribute("pagination", search); //����¡
		model.addAttribute("boardList", boardService.getBoardList(search));
		return "getBoardList.jsp";
	}
}
