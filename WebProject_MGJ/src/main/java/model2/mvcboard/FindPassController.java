package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import membership.MemberDAO;
import membership.MemberDTO;

@WebServlet("/findpass.do")
public class FindPassController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("findpass.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 	String id = req.getParameter("id");
	        String email = req.getParameter("email");

	        MemberDAO memberDAO = new MemberDAO(getServletContext());
	        MemberDTO dto = memberDAO.findPass(id, email);

	        if (dto.getPass() != null) {
	            req.setAttribute("pass", dto.getPass());
	            req.getRequestDispatcher("./findpassResult.jsp").forward(req, resp);
	        } else {
	            req.setAttribute("error", "해당 아이디 또는 이메일로 등록된 비밀번호가 없습니다.");
	            req.getRequestDispatcher("./findpass.jsp").forward(req, resp);
	        }
	}
}
