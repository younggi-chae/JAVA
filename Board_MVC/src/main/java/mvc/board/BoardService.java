package mvc.board;

import java.util.List;

public interface BoardService {

	//�۵��
	void insertBoard(BoardDTO dto); 

	//�ۼ���   
	void updateBoard(BoardDTO dto);
	
	//�ۻ���
	void deleteBoard(BoardDTO dto);

	//�ۻ� ��ȸ
	BoardDTO getBoard(BoardDTO dto);

	//�� ��� ��ȸ
	List<BoardDTO> getBoardList(BoardDTO dto);
	//�� ��ȸ�� 
	void updateCnt(BoardDTO dto);

}