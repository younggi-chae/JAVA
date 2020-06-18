package mvc.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import org.springframework.stereotype.Repository;
import mvc.board.BoardDTO;
import mvc.common.JDBCUtil;


// DAO(Data Access Object)
@Repository("boardDAO")
public class BoardDAO {
	// JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	// SQL ��ɾ��
	private final String BOARD_INSERT = "insert into board(SEQ, TITLE, WRITER, CONTENT) "
										+ "values((select ifnull(max(seq),0)+1 from board as a),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board where seq=?";
	private final String BOARD_GET = "select * from board where seq=?";
    //private final String BOARD_LIST = "select * from board order by seq desc";
	private final String BOARD_LIST_T = "select * from board where title like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like '%'||?||'%' order by seq desc";

	// CRUD ����� �޼ҵ� ����
	// �� ���
	public void insertBoard(BoardDTO dto) {
		System.out.println("===> JDBC�� insertBoard() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, dto.getTitle());
			stmt.setString(2, dto.getWriter());
			stmt.setString(3, dto.getContent());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �� ����
	public void updateBoard(BoardDTO dto) {
		System.out.println("===> JDBC��  updateBoard() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_UPDATE);
			stmt.setString(1, dto.getTitle());
			stmt.setString(2, dto.getContent());
			stmt.setInt(3, dto.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);

		}
	}

	// �� ����
	public void deleteBoard(BoardDTO dto) {
		System.out.println("===> JDBC��  deleteBoard() ��� ó��");
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, dto.getSeq());
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(stmt, conn);
		}
	}

	// �� �� ��ȸ
	public BoardDTO getBoard(BoardDTO dto) {
		System.out.println("===> JDBC��  getBoard() ��� ó��");
		BoardDTO board = null;
		try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_GET);
			stmt.setInt(1, dto.getSeq());
			rs = stmt.executeQuery();
			if (rs.next()) {
				board = new BoardDTO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);

		}
		return board;

	}

	// �� ��� ��ȸ
	public List<BoardDTO> getBoardList(BoardDTO dto) {
		System.out.println("===> JDBC��  getBoardList() ��� ó��");
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		try {
			conn = JDBCUtil.getConnection();
			if(dto.getSearchCondition().equals("TITLE")) {
				stmt = conn.prepareStatement(BOARD_LIST_T);
			} else if(dto.getSearchCondition().equals("CONTENT")) {
				stmt = conn.prepareStatement(BOARD_LIST_C);
			}
			stmt.setString(1, dto.getSearchKeyword());
			rs = stmt.executeQuery();
			while (rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setSeq(rs.getInt("SEQ"));
				board.setTitle(rs.getString("TITLE"));
				board.setWriter(rs.getString("WRITER"));
				board.setContent(rs.getString("CONTENT"));
				board.setRegDate(rs.getDate("REGDATE"));
				board.setCnt(rs.getInt("CNT"));
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, stmt, conn);
		}
		return boardList;
	}

}
