package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/write.do")
public class WriteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("./write.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String ID = (String) session.getAttribute("id");

        if (ID == null) {
            resp.sendRedirect("./login.do");
            return;
        }

        String title = req.getParameter("title");
        String content = req.getParameter("content");

        BoardDTO dto = new BoardDTO();
        dto.setId(ID); 
        dto.setTitle(title);
        dto.setContent(content);
        
        ServletContext context = getServletContext();
        BoardDAO dao = new BoardDAO(getServletContext());
        int result = dao.insertPost(dto);

        if (result == 1) {
            resp.sendRedirect("./release-list.do"); 
        } else {
            resp.sendRedirect("./write.do"); 
        }
    }
}
