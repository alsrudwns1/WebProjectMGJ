package membership;

import common.JDBConnect;
import jakarta.servlet.ServletContext;

/* DAO(Data Access Object)
 * : 실제 데이터베이스에 접근하여 기본적인 CRUD 작업을 하기 위한 객체.
 * DB접속 및 select 와 같은 쿼리문을 실행한 후 결과를 반환받는 기능을
 * 수행한다.
 */

//JDBC를 위한 클래스를 상속하여 DB에 연결한다. 
public class MemberDAO extends JDBConnect {

	// 생성자 1: 드라이버, 커넥션URL 등 4개의 매개변수로 정의
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv, url, id, pw);
	}

	// 생성자 2: application 내장객체를 매개변수로 정의
	public MemberDAO(ServletContext application) {
		super(application);
	}

	/*
	 * 사용자가 입력한 아이디, 패스워드를 통해 회원테이블을 select 한 후 존재하는 회원정보인 경우 DTO 객체에 레코드를 저장한 후
	 * 반환한다.
	 */

	// 회원가입을 위한 메서드 생성
	public int memberRegister(MemberDTO memberDTO) {
		String sql = " INSERT INTO memberlist (id, pass, name, email, mobile) " + " VALUES (?, ?, ?, ?, ?)";

		int result = 0;
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, memberDTO.getId());
			psmt.setString(2, memberDTO.getPass());
			psmt.setString(3, memberDTO.getName());
			psmt.setString(4, memberDTO.getEmail());
			psmt.setString(5, memberDTO.getMobile());
			result = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// 회원인증
	public MemberDTO memberAuth(String id, String pass) {
		String sql = "SELECT * FROM memberlist WHERE id =? AND pass=?";
		MemberDTO dto = new MemberDTO();

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pass);

			rs = psmt.executeQuery();
			if (rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setMobile(rs.getString("mobile"));
				System.out.println("로그인 성공: " + dto.getId()); // 디버그 출력
			} else {
				System.out.println("로그인 실패"); // 디버그 출력
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	public int updateMember(MemberDTO dto) {
	    int result = 0;
	    String sql = "UPDATE memberlist SET name=?, email=?, mobile=?, pass=? WHERE id=?";
	    
	    try {
	        psmt = con.prepareStatement(sql);
	        psmt.setString(1, dto.getName());
	        psmt.setString(2, dto.getEmail());
	        psmt.setString(3, dto.getMobile());
	        psmt.setString(4, dto.getPass());
	        psmt.setString(5, dto.getId());
	        
	        result = psmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}

	public MemberDTO getMemberById(String id) {
	    MemberDTO dto = new MemberDTO();
	    String sql = "SELECT * FROM memberlist WHERE id=?";
	    
	    try {
	        psmt = con.prepareStatement(sql);
	        psmt.setString(1, id);
	        
	        rs = psmt.executeQuery();
	        if(rs.next()) {
	            dto.setId(rs.getString("id"));
	            dto.setName(rs.getString("name"));
	            dto.setEmail(rs.getString("email"));
	            dto.setMobile(rs.getString("mobile"));
	            dto.setPass(rs.getString("pass"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return dto;
	}
	
	public MemberDTO findId(String email) {
	    MemberDTO dto = new MemberDTO();
	    String sql = "SELECT id FROM memberlist WHERE email=?";
	    
	    try {
	        psmt = con.prepareStatement(sql);
	        psmt.setString(1, email);
	        
	        rs = psmt.executeQuery();
	        if(rs.next()) {
	            dto.setId(rs.getString("id"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return dto;
	}
	
	public MemberDTO findPass(String id, String email) {
	    MemberDTO dto = new MemberDTO();
	    String sql = "SELECT pass FROM memberlist WHERE id=? AND email=?";
	    
	    try {
	        psmt = con.prepareStatement(sql);
	        psmt.setString(1, id);
	        psmt.setString(2, email);
	        
	        rs = psmt.executeQuery();
	        if(rs.next()) {
	            dto.setPass(rs.getString("pass"));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return dto;
	}
}
