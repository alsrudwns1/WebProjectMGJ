package model2.mvcboard;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.DBConnPool;
import model1.board.BoardDTO;

public class MVCBoardDAO extends DBConnPool {
	public MVCBoardDAO() {
		super();
	}
	
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		String query = "SELECT COUNT(*) FROM mvcboard";
		if (map.get("searchWord") != null) {
			query += " WHERE " + map.get("searchField") + " "
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1);
		} 
		catch (Exception e) {
			System.out.println("게시물 카운트 중 예외 발생");
			e.printStackTrace();
		}
		
		return totalCount;
	}
	
	public List<MVCBoardDTO> selectListPage(Map<String,Object> map) {
		List<MVCBoardDTO> board = new Vector<MVCBoardDTO>();
		String query = " " 
				+ "SELECT * FROM ( "
				+ "       SELECT Tb.*, ROWNUM rNum FROM ( "
				+ "         SELECT * FROM mvcboard ";
		if (map.get("searchWord")!=null) {
			query += " WHERE " + map.get("searchField") + " "
					+ " LIKE '%" + map.get("searchWord") + "%'";
		}
		query += "    ORDER BY idx DESC "
				+"    ) Tb "
				+" ) "
				+" WHERE rNum BETWEEN ? AND ?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				board.add(dto);
			}
		} catch (Exception e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		return board;
	}
	
	public int insertWrite(MVCBoardDTO dto) {
	    int result = 0;

	    try {
	        String query = "INSERT INTO mvcboard ( "
	                + " idx,name,title,content,ofile,sfile,pass) "
	                + " VALUES ( "
	                + " seq_board_num.NEXTVAL, ?, ?, ?, ?, ?, ?)";

	        psmt = con.prepareStatement(query);
	        psmt.setString(1, dto.getName());
	        psmt.setString(2, dto.getTitle());
	        psmt.setString(3, dto.getContent());
	        psmt.setString(4, dto.getOfile());
	        psmt.setString(5, dto.getSfile());
	        psmt.setString(6, dto.getPass());
	        result = psmt.executeUpdate();

	    } catch (Exception e) {
	        System.out.println("게시물 입력 중 예외 발생");
	        e.printStackTrace();
	    }

	    return result;
	}
	
	//상세보기를 위해 일련번호에 해당하는 레코드 1개를 인출해 반환
	public MVCBoardDTO selectView(String idx) {
		MVCBoardDTO dto = new MVCBoardDTO();
		//인파라미터가 있는 select 쿼리문
		String query = "SELECT * FROM mvcboard WHERE idx=?";
		try {
			//인파라미터 설정 및 쿼리실행
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
			}
			
		} catch (Exception e) {
			System.out.println("게시물 상세보기 중 예외발생");
			e.printStackTrace();
		}
		return dto;
	}
	
	//게시물의 조회수를 증가
	public void updateVisitCount(String idx) {
		String query = "UPDATE mvcboard SET "
				+ " visitcount = visitcount+1 "
				+ " WHERE idx=? ";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			psmt.executeQuery();
			
		} catch (Exception e) {
			System.out.println("게시물 조회수 증가 중 예외발생");
			e.printStackTrace();
		}
	}
	
	//파일 다운로드 시 카운트 증가
	public void downCountPlus(String idx) {
		String sql = "UPDATE mvcboard SET"
				+ " downcount=downcount+1 "
				+ " WHERE idx=? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, idx);
			psmt.executeUpdate();
			
		} catch (Exception e) {}
	}
	
	//패스워드 검증
	public boolean confirmPassWord(String pass, String idx) {
		boolean isCorr = true;
		
		try {
			/* 패스워드와 일련번호 두가지 조건에 만족하는 게시물이 있는지
			 * 확인한다.  게시물을 인출할 목적이 아니므로 count()함수 */
			String sql = "SELECT COUNT(*) FROM mvcboard WHERE pass=? AND idx=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, pass);
			psmt.setString(2, idx);
			rs = psmt.executeQuery();
			
			//count()함수는 항상 결과가 있으므로 조건문 없이 호출한다.
			rs.next();
			if (rs.getInt(1)==0) {
				//조건에 맞는 게시물이 없는 경우 false로 변경
				isCorr = false;
			}
			
		} catch (Exception e) {
			//예외가 발생하여 확인이 안되는 경우에도 false
			isCorr = false;
			e.printStackTrace();
		}
		return isCorr;
	}
	
	//일련번호에 해당하는 게시물을 삭제
	public int deletePost(String idx) {
		int result = 0;
		try {
			String query = "DELETE FROM mvcboard WHERE idx=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("게시물 삭제 중 예외발생");
			e.printStackTrace();
		}
		return result;
	}
	
	//게시물 수정
	public int updatePost(MVCBoardDTO dto) {
		int result = 0;
		try {
			//수정을 위한 update 쿼리문 작성(일련번호와 패스워드까지 조건문에 추가됨)
			String query = "UPDATE mvcboard "
					+ " SET title=?, name=?, content=?, ofile=?, sfile=? "
					+ " WHERE idx=? and pass=?";
			
			 psmt = con.prepareStatement(query);
		        psmt.setString(1, dto.getTitle());
		        psmt.setString(2, dto.getName());
		        psmt.setString(3, dto.getContent());
		        psmt.setString(4, dto.getOfile());
		        psmt.setString(5, dto.getSfile());
		        psmt.setString(6, dto.getIdx());
		        psmt.setString(7, dto.getPass());
		        result = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("게시물 수정중 예외발생");
			e.printStackTrace();
		}
		return result;
	}
}
