package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/* 내용보기의 매핑은 web.xml이 아닌 어노테이션을 통해 설정한다. */
@WebServlet("/release-view.do")
public class ViewController extends HttpServlet {

	/*
	 * 서블릿의 수명주기 매서드 중 전송방식에 상관없이 요청을 처리하고 싶을 때는 service()를 오버라이딩 하면 된다. 해당 메서드의 역할은
	 * 요청을 분석한 후 doGet() 혹은 doPost()를 호출하는 것이다.
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		BoardDAO dao = new BoardDAO();
		// 파라미터로 전달된 일련번호 받기
		String num = req.getParameter("num");
		// 조회수 증가하기
		dao.updateVisitCount(num);
		// 게시물 인출
		BoardDTO dto = dao.selectView(num);
		dao.close();

		if (dto != null && dto.getContent() != null) {
			dto.setContent(dto.getContent().replaceAll("\r\n", "<br />"));
		}

		// 게시물이 저장된 DTO객체를 request영역에 저장하고 JSP로 포워드함.
		req.setAttribute("dto", dto);
		req.getRequestDispatcher("./release-view.jsp").forward(req, resp);
	}
}
