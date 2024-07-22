package model2.mvcboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletContext;
import membership.MemberDAO;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public BoardDAO() {
		try {
			// 데이터 소스 조회 및 연결
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 생성자 2: ServletContext 내장객체를 매개변수로 정의
	public BoardDAO(ServletContext application) {
		try {
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 게시물의 총 개수를 반환하는 메서드
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		String query = "SELECT COUNT(*) FROM board";
		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " LIKE ?";
		}

		try {
			psmt = conn.prepareStatement(query);
			if (map.get("searchWord") != null) {
				psmt.setString(1, "%" + map.get("searchWord") + "%");
			}
			rs = psmt.executeQuery();
			if (rs.next()) {
				totalCount = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalCount;
	}

	// 게시물 목록을 반환하는 메서드
	public List<BoardDTO> selectListPage(Map<String, Object> map) {
		List<BoardDTO> board = new ArrayList<>();
		String query = "SELECT * FROM (SELECT ROWNUM rnum, B.* FROM (SELECT * FROM board ORDER BY num DESC) B) WHERE rnum BETWEEN ? AND ?";

		try {
			psmt = conn.prepareStatement(query);
			psmt.setInt(1, (Integer) map.get("start"));
			psmt.setInt(2, (Integer) map.get("end"));
			rs = psmt.executeQuery();

			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
				board.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
	}

	// 게시물 삽입 메서드
	public int insertPost(BoardDTO dto) {
		int result = 0;

		try {
			// MemberDAO를 통해 회원 존재 여부 확인
			MemberDAO memberDAO = new MemberDAO();
			if (!memberDAO.isMemberExists(dto.getId())) {
				System.out.println("Member with ID " + dto.getId() + " does not exist.");
				return result; // 회원이 존재하지 않을 경우
			}

			String query = "INSERT INTO board (num, title, content, id, postdate, visitcount) VALUES (seq_board_num.NEXTVAL, ?, ?, ?, SYSDATE, 0)";
			psmt = conn.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 상세보기를 위해 일련번호에 해당하는 레코드 1개를 인출해 반환
	public BoardDTO selectView(String num) {
		BoardDTO dto = new BoardDTO();
		// 인파라미터가 있는 select 쿼리문
		String query = "SELECT * FROM board WHERE num=?";
		try {
			// 인파라미터 설정 및 쿼리실행
			psmt = conn.prepareStatement(query);
			psmt.setString(1, num);
			rs = psmt.executeQuery();

			if (rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setId(rs.getString("id"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setVisitcount(rs.getString("visitcount"));
			}

		} catch (Exception e) {
			System.out.println("게시물 상세보기 중 예외발생");
			e.printStackTrace();
		}
		return dto;
	}

	// 게시물의 조회수를 증가
	public void updateVisitCount(String num) {
		String query = "UPDATE board SET " + " visitcount = visitcount+1 " + " WHERE num=? ";
		try {
			psmt = conn.prepareStatement(query);
			psmt.setString(1, num);
			psmt.executeQuery();

		} catch (Exception e) {
			System.out.println("게시물 조회수 증가 중 예외발생");
			e.printStackTrace();
		}
	}

	// 게시물 수정 메서드
	public int updatePost(BoardDTO dto) {
		int result = 0;
		String query = "UPDATE board SET title = ?, content = ? WHERE num = ?";

		try (PreparedStatement psmt = conn.prepareStatement(query)) {

			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setInt(3, dto.getNum());

			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 글 삭제 메소드
	public boolean deleteBoard(int num) {
		boolean result = false;
		String query = "DELETE FROM board WHERE num = ?";

		try (PreparedStatement psmt = conn.prepareStatement(query)) {

			psmt.setInt(1, num);
			int rowsAffected = psmt.executeUpdate();
			result = rowsAffected > 0;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	// 자원 해제 메서드
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
