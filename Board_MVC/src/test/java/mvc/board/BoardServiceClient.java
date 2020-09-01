//package mvc.board;
//
//import java.util.List;
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//
//import mvc.board.BoardDTO;
//import mvc.board.BoardService;
//
//public class BoardServiceClient {
//	public static void main(String[] args) {
//		
//		// 1. Spring �����̳ʸ� �����Ѵ�.
//		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
//		
//		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup �Ѵ�.
//		BoardService boardService = (BoardService) container.getBean("boardService");
//		
//		// 3. �� ��� ��� �׽�Ʈ
//		BoardDTO dto = new BoardDTO();
//		dto.setTitle("�ӽ� ����"); 
//		dto.setWriter("ȫ�浿");  
//		dto.setContent("�ӽó���...");
//		boardService.insertBoard(dto);
//		
//		// 4. �� ��� �˻� ��� �׽�Ʈ
//		List<BoardDTO> boardList = boardService.getBoardList(dto);
//		for(BoardDTO board : boardList) {
//			System.out.println("===>" + board.toString());
//		}
//		
//		// 5. Spring �����̳� ����
//		container.close();
//		
//	}
//}