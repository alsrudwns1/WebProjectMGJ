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
		// 게시물 번호 파라미터 받기
		String num = req.getParameter("num");

		// 게시물 인출
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.selectView(num);
		dao.close();

		// 게시물이 저장된 DTO 객체를 request 영역에 저장하고 JSP로 포워드함.
		req.setAttribute("dto", dto);
		req.getRequestDispatcher("./release-edit.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 파라미터 인코딩 설정
		req.setCharacterEncoding("UTF-8");

		// 폼 파라미터 받기
		String num = req.getParameter("num");
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		// DTO 객체에 폼 데이터 설정
		BoardDTO dto = new BoardDTO();
		dto.setNum(Integer.parseInt(num));
		dto.setTitle(title);
		dto.setContent(content);

		// 데이터베이스에 업데이트
		BoardDAO dao = new BoardDAO();
		int result = dao.updatePost(dto);
		dao.close();

		if (result == 1) {
			// 수정 성공시 상세보기 페이지로 리다이렉트
			resp.sendRedirect("./release-view.do?num=" + num);
		} else {
			req.setAttribute("error", "수정하기 실패");
			req.getRequestDispatcher("./release-edit.jsp").forward(req, resp);
		}
	}
}
