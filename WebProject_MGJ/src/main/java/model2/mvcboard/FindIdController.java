package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import membership.MemberDAO;
import membership.MemberDTO;

@WebServlet("/findID.do")
public class FindIdController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./findID.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");

        MemberDAO memberDAO = new MemberDAO(getServletContext());
        MemberDTO dto = memberDAO.findId(email);

        if (dto.getId() != null) {
            req.setAttribute("id", dto.getId());
            req.getRequestDispatcher("./findIdResult.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "해당 이메일로 등록된 아이디가 없습니다.");
            req.getRequestDispatcher("./findID.jsp").forward(req, resp);
        }
    }
}
