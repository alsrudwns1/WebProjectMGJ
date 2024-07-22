package model2.mvcboard;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete.do")
public class DeleteController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String userId = (String) session.getAttribute("id");

		if (userId == null) {
			resp.sendRedirect("./login.do");
			return;
		}

		String num = req.getParameter("num");

		int del = Integer.parseInt(num);
		BoardDAO dao = new BoardDAO(getServletContext());

		boolean success = dao.deleteBoard(del);

		if (success) {
			resp.sendRedirect("./release-list.do");
		}
	}
}
