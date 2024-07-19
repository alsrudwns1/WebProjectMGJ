package model2.mvcboard;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import membership.MemberDAO;
import membership.MemberDTO;

@WebServlet("/create.do")
public class creatController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("./create.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPass(pass);
		memberDTO.setName(name);
		memberDTO.setEmail(email);
		memberDTO.setMobile(mobile);
		
		ServletContext application = getServletContext();
		MemberDAO memberDAO = new MemberDAO(application);
		int result = memberDAO.memberRegister(memberDTO);
		if(result==1) {
			resp.sendRedirect("./login.do");
		}
		else {
			resp.sendRedirect("./create.do");
		}
	}

}
