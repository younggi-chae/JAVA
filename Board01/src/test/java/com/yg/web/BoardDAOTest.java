//package com.yg.web;
//
//import java.util.List;
//
//import javax.inject.Inject;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.yg.web.board.dao.BoardDAO;
//import com.yg.web.board.model.BoardDTO;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//		"classpath:spring/root-context.xml",
//		"classpath:spring/dataSource-context.xml"
//		})
//
//public class BoardDAOTest {
//
//	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
//
//	@Inject
//	private BoardDAO boardDAO;	
//
////	@Test @Ignore
////	public void testGetBoardList() throws Exception {
////		List<BoardDTO> boardList = boardDAO.getBoardList(search);
////		logger.info("\n Board List \n ");
////
////		if(boardList.size() > 0) {
////			for(BoardDTO list : boardList) {
////				logger.info(list.title);
////			}
////
////		} else {
////			logger.info("�����Ͱ� �����ϴ�.");
////
////		}
////	}
//	
//
//	@Test 
//	public void testGetBoardContent() throws Exception {
//		BoardDTO boardDTO = boardDAO.getBoardContent(1);
//		logger.info("\n Board List \n ");
//		if(boardDTO != null) {
//			logger.info("�۹�ȣ : " + boardDTO.getBid() );
//			logger.info("������ : " + boardDTO.getTitle() );
//			logger.info("�۳��� : " + boardDTO.getContent() );
//			logger.info("���±� : " + boardDTO.getTag() );
//			logger.info("��ȸ�� : " + boardDTO.getView_cnt() );
//			logger.info("�ۼ��� : " + boardDTO.getReg_id() );
//			logger.info("�ۼ��� : " + boardDTO.getReg_dt() );
//			logger.info("������ : " + boardDTO.getEdit_dt() );
//
//		} else {
//			logger.info("�����Ͱ� �����ϴ�.");
//
//		}
//	}
//
//	@Test  @Ignore 
//	public void testInsertBoard() throws Exception {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setCate_cd("1");
//		boardDTO.setTag("1");
//		boardDTO.setReg_id("1");	
//		
//		for( int i = 1; i < 1234 ; i++) {
//		    boardDTO.setTitle(i + " ��° �Խù� �Դϴ�.");
//		    boardDTO.setContent(i + " ��° �Խù� �Դϴ�.");
//
//		int result = boardDAO.insertBoard(boardDTO);
//		logger.info("\n Insert Board Result " +result);		
//		if(result == 1) {
//			logger.info("\n �Խù� ��� ���� ");
//		} else {
//			logger.info("\n �Խù� ��� ����");
//		}
//		}
//	}	
//
//	@Test @Ignore 
//	public void testUpdateBoard() throws Exception {
//		BoardDTO boardVO = new BoardDTO();
//		boardVO.setBid(1);
//		boardVO.setCate_cd("1");
//		boardVO.setTitle("ù��° �Խù� �Դϴ�-���� �մϴ�.");
//		boardVO.setContent("ù��° �Խù��Դϴ�-�����մϴ�.");
//		boardVO.setTag("1-1");		
//
//		int result = boardDAO.updateBoard(boardVO);
//		logger.info("\n Update Board Result \n ");
//		if(result > 0) {
//			logger.info("\n �Խù� ���� ���� ");
//		} else {
//			logger.info("\n �Խù� ���� ����");
//		}
//	}
//
//	@Test   @Ignore
//	public void tesDeleteBoard() throws Exception {
//		int result = boardDAO.deleteBoard(1);
//		logger.info("\n Delete Board Result \n ");
//		if(result > 0) {
//			logger.info("\n �Խù� ���� ���� ");
//		} else {
//			logger.info("\n �Խù� ���� ����");
//		}
//	}
//
//	@Test @Ignore
//	public void testUpdateViewCnt() throws Exception {
//		int result = boardDAO.updateViewCnt(1);
//		logger.info("\n Update View Count Result \n ");
//		if(result > 0) {
//			logger.info("\n �Խù� ��ȸ�� ������Ʈ ���� ");
//		} else {
//			logger.info("\n �Խù� ��ȸ�� ������Ʈ ����");
//		}
//	}
//}
