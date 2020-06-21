//package mvc.board.impl;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//
//import mvc.board.BoardDTO;
//
//@Repository
//public class BoardDAOJPA {
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	public void insertBoard(BoardDTO dto) {
//		System.out.println("===> JPA�� insertBoard() ��� ó��");
//		em.persist(dto);
//	}
//	
//	public void updateBoard(BoardDTO dto) {
//		System.out.println("===> JPA�� updateBoard() ��� ó��");
//		em.merge(dto);
//	}
//	
//	public void deleteBoard(BoardDTO dto) {
//		System.out.println("===> JPA�� deleteBoard() ��� ó��");
//		em.remove(em.find(BoardDTO.class, dto.getSeq()));
//	}
//	
//	public BoardDTO getBoard(BoardDTO dto) {
//		System.out.println("===> JPA�� getBoard() ��� ó��");
//		return (BoardDTO) em.find(BoardDTO.class, dto.getSeq());
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<BoardDTO> getBoardList(BoardDTO dto) {
//		System.out.println("===> JPA�� getBoardList() ��� ó��");
//		return em.createQuery("from BoardDTO b order by b.seq desc").getResultList();
//	}
//}
