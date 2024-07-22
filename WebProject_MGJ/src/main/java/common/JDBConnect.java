package common;

import jakarta.servlet.ServletContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
    
    // 멤버 변수 : DB 연결, 정적 쿼리, 동적 쿼리, select 결과 반환
    public Connection con;
    public Statement stmt;
    public PreparedStatement psmt;
    public ResultSet rs;
    
    // 기본 생성자 : 매개변수가 없는 생성자
    public JDBConnect() {
        try {
            // 오라클 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 커넥션 URL, 아이디, 패스워드 준비
            String url = "jdbc:oracle:thin:@localhost:1522:xe";
            String id = "musthave";
            String pwd = "1234";
            // 데이터베이스 연결 시도
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("디비 연결 성공 (기본 생성자)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 인자 생성자 1: 4개의 매개변수
    public JDBConnect(String driver, String url, String id, String pwd) {
        try {
            // 매개변수를 통해 DB 연결 시도
            Class.forName(driver);
            con = DriverManager.getConnection(url, id, pwd);
            System.out.println("디비 연결 성공 (인수 생성자 1)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 인자 생성자 2: ServletContext 내장 객체를 매개변수로 선언
    public JDBConnect(ServletContext application) {
        if (application == null) {
            throw new IllegalArgumentException("ServletContext cannot be null");
        }
        
        try {
            String driver = application.getInitParameter("OracleDriver");
            if (driver != null) {
                Class.forName(driver);
            } else {
                throw new IllegalArgumentException("OracleDriver init parameter is missing");
            }

            String url = application.getInitParameter("OracleURL");
            String id = application.getInitParameter("OracleId");
            String pwd = application.getInitParameter("OraclePwd");

            if (url != null && id != null && pwd != null) {
                con = DriverManager.getConnection(url, id, pwd);
                System.out.println("디비 연결 성공 (인수 생성자 2)");
            } else {
                throw new IllegalArgumentException("Database connection parameters are missing");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 자원 해제 메서드
    public void close() {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (psmt != null) psmt.close();
            if (con != null) con.close();
            System.out.println("JDBC 자원 해제");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
