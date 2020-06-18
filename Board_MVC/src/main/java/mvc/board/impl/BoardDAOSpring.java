package mvc.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mvc.board.BoardDTO;

@Repository
public class BoardDAOSpring {
	     
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARD_INSERT = "insert into board(SEQ, TITLE, WRITER, CONTENT) "
			+ "values((select ifnull(max(seq),0)+1 from board as a),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board where seq=?";
	private final String BOARD_GET    = "select * from board where seq=?";
	private final String BOARD_LIST_T = "select * from board where title like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like '%'||?||'%' order by seq desc";
	 
	//�۵��
	public void insertBoard(BoardDTO dto) {
		System.out.println("===> JDBC�� insertBoard() ��� ó��");
		jdbcTemplate.update(BOARD_INSERT, dto.getTitle(), dto.getWriter(), dto.getContent());
	}
	
	//�ۼ���
	public void updateBoard(BoardDTO dto) {
		System.out.println("===> JDBC�� updateBoard() ��� ó��");
		jdbcTemplate.update(BOARD_UPDATE, dto.getTitle(), dto.getContent(), dto.getSeq());
	}
	
	//�ۻ���
	public void deleteBoard(BoardDTO dto) {
		System.out.println("===> JDBC�� deleteBoard() ��� ó��");
		jdbcTemplate.update(BOARD_DELETE, dto.getSeq());
	}
	
	//�ۻ� ��ȸ
	public BoardDTO getBoard(BoardDTO dto) {
		System.out.println("===> JDBC�� getBoard() ��� ó��");
		Object[] args = {dto.getSeq()};	
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	//�� ��� ��ȸ
	public List<BoardDTO> getBoardList(BoardDTO dto) {
		System.out.println("===> JDBC�� getBoardList() ��� ó��");
		Object[] args = {dto.getSearchKeyword()};
		if(dto.getSearchCondition().equals("TITLE")) {
			return jdbcTemplate.query(BOARD_LIST_T, args, new BoardRowMapper());
		} else if(dto.getSearchCondition().equals("CONTENT")) {
			return jdbcTemplate.query(BOARD_LIST_C, args, new BoardRowMapper());
		}
		
		return null;
	} 
	
	
}

class BoardRowMapper implements RowMapper<BoardDTO> {
	public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDTO board = new BoardDTO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWriter(rs.getString("WRITER"));
		board.setContent(rs.getString("CONTENT"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}
}
