package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import membership.MemberDAO;
import membership.MemberDTO;

@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		MemberDAO memberDAO = new MemberDAO(getServletContext());
		MemberDTO dto = memberDAO.memberAuth(id, pass);
		
		if(dto.getId() == null || dto.getId().equals("")) {
			//로그인 실패한 경우 로그인 페이지로 이동
			resp.sendRedirect("./login.do");
			System.out.println("로그인실패");
		}
		else {
			//서블릿에서 request 내장객체를 통해 session 내장객체를 얻어온다
			HttpSession session = req.getSession();
			
			//로그인 성공한 경우 세선영역에 회원정보 저장
			session.setAttribute("SessionId", dto.getId());
			session.setAttribute("SessionName", dto.getName());
			
			//메인화면 이동
			resp.sendRedirect("./release-list.do");
			System.out.println("로그인성공");
			
		}
	}
}
