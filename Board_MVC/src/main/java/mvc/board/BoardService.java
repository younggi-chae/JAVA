package mvc.board;

import java.util.List;

import mvc.common.Search;

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
	List<BoardDTO> getBoardList(Search search);
	
	//�� ��ȸ�� 
	void updateCnt(BoardDTO dto);
	
	int getBoardListCnt(Search search);
	
    List<ReplyDTO> getReplyList(int bid);
	
	int saveReply(ReplyDTO replyDTO);	

	int updateReply(ReplyDTO replyDTO);	

	int deleteReply(int rid);
	
}