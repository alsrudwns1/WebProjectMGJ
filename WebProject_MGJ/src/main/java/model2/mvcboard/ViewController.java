package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/release-view.do")
public class ViewController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BoardDAO dao = new BoardDAO();
		String num = req.getParameter("num");
		dao.updateVisitCount(num);
		BoardDTO dto = dao.selectView(num);
		dao.close();

		if (dto != null && dto.getContent() != null) {
			dto.setContent(dto.getContent().replaceAll("\r\n", "<br />"));
		}

		req.setAttribute("dto", dto);
		req.getRequestDispatcher("./release-view.jsp").forward(req, resp);
	}
}
