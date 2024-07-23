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

		MemberDAO dao = new MemberDAO(getServletContext());
		MemberDTO dto = dao.getMemberDTO(id, pass);

		if (dto != null && dto.getId() != null) {
			HttpSession session = req.getSession();
			session.setAttribute("id", dto.getId());
			resp.sendRedirect("./release-list.do"); 
		} else {
			req.setAttribute("error", "로그인에 실패하였습니다.");
			req.getRequestDispatcher("./login.jsp").forward(req, resp); 
		}
	}
}
