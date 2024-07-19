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

@WebServlet("/update.do")
public class updateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("SessionId");

		if (id == null) {
			resp.sendRedirect("./login.do");
			return;
		}

		MemberDAO memberDAO = new MemberDAO(getServletContext());
		MemberDTO dto = memberDAO.getMemberById(id);

		req.setAttribute("name", dto.getName());
		req.setAttribute("email", dto.getEmail());
		req.setAttribute("mobile", dto.getMobile());

		req.getRequestDispatcher("./update.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String id = (String) session.getAttribute("SessionId");

		if (id == null) {
			resp.sendRedirect("./login.do");
			return;
		}

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String pass = req.getParameter("pass");

		MemberDAO memberDAO = new MemberDAO(getServletContext());
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setEmail(email);
		dto.setMobile(mobile);
		dto.setPass(pass);

		int result = memberDAO.updateMember(dto);

		if (result > 0) {
			session.setAttribute("SessionName", name);
			resp.sendRedirect("./release-list.do");
		} else {
			req.setAttribute("error", "회원정보 수정에 실패했습니다.");
			req.getRequestDispatcher("./update.jsp").forward(req, resp);
		}
	}

}
