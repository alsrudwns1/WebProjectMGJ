package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/release-edit.do")
public class EditController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num = req.getParameter("num");

		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.selectView(num);
		dao.close();

		req.setAttribute("dto", dto);
		req.getRequestDispatcher("./release-edit.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String num = req.getParameter("num");
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		BoardDTO dto = new BoardDTO();
		dto.setNum(Integer.parseInt(num));
		dto.setTitle(title);
		dto.setContent(content);

		BoardDAO dao = new BoardDAO();
		int result = dao.updatePost(dto);
		dao.close();

		if (result == 1) {
			resp.sendRedirect("./release-view.do?num=" + num);
		} else {
			req.setAttribute("error", "수정하기 실패");
			req.getRequestDispatcher("./release-edit.jsp").forward(req, resp);
		}
	}
}
