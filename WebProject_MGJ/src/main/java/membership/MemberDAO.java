package membership;

import common.JDBConnect;
import jakarta.servlet.ServletContext;

public class MemberDAO extends JDBConnect {

    // 기본 생성자
    public MemberDAO() {
        super(); // 부모 클래스의 기본 생성자를 호출하여 DB 연결 설정
    }

    // 생성자 1: 드라이버, 커넥션 URL 등 4개의 매개변수로 정의
    public MemberDAO(String drv, String url, String id, String pw) {
        super(drv, url, id, pw);
    }

    // 생성자 2: ServletContext 내장객체를 매개변수로 정의
    public MemberDAO(ServletContext application) {
        super(application); // 부모 클래스의 생성자를 호출하여 ServletContext를 사용
    }

    // 회원가입을 위한 메서드
    public int memberRegister(MemberDTO memberDTO) {
        String sql = "INSERT INTO memberlist (id, pass, name, email, mobile) VALUES (?, ?, ?, ?, ?)";

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
                dto = null; // 로그인 실패 시 null 반환
                System.out.println("로그인 실패"); // 디버그 출력
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    // 새로운 getMemberDTO 메서드 추가
    public MemberDTO getMemberDTO(String id, String pass) {
        return memberAuth(id, pass);
    }

    // 회원정보 수정
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

    // 회원정보 조회
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
    
    // 아이디 찾기
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
    
    // 비밀번호 찾기
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
    
    public boolean isMemberExists(String id) {
        String sql = "SELECT COUNT(*) FROM memberlist WHERE id = ?";
        try {
            psmt = con.prepareStatement(sql);
            psmt.setString(1, id);
            rs = psmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
