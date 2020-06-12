package ex.board;

import java.util.*;

import org.springframework.context.support.*;

public class BoardServiceClient {

	
	public static void main(String[] args) {

		// 1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("application_boardContext.xml");

		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� lookup�Ѵ�.
		BoardService boardService = (BoardService) container.getBean("boardService");

		// 3. �� ��� ��� �׽�Ʈ

		BoardVO vo = new BoardVO();
		vo.setTitle("�ӽ� ����");
		vo.setWriter("ȫ�浿");
		vo.setContent("�ӽ� ����.....");
		boardService.insertBoard(vo);

		// 4. �� ��� �˻� ��� �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO board : boardList) {
			System.out.println("===>" + board.toString());
		}

		// 5. Spring �����̳� ����
		container.close();

	}

}
