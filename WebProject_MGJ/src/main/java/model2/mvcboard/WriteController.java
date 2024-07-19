package model2.mvcboard;

import java.io.IOException;
import fileupload.FileUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.JSFunction;

public class WriteController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		req.getRequestDispatcher("/write.jsp").forward(req, resp);
	}
	
	
	/* 글쓰기는 post방식의 전송이므로 dopost()에서 요청 처리 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		//업로드 디렉토리의 물리적 경로 확인
		String saveDirectory = req.getServletContext().getRealPath("/Uploads");
		
		//파일 업로드
		String originalFileName = "";
		try {
			//업로드가 정상적으로 완료되면 원본파일명 반환
			originalFileName = FileUtil.uploadFile(req, saveDirectory);
		} 
		catch (Exception e) {
			e.printStackTrace();
			/* 파일 업로드시 오류가 발생되면 경고창을 띄우고
			 * 작성 페이지로 이동함 */
			JSFunction.alertLocation(resp, "파일 업로드 오류입니다.",
					"./write.do");	
			return;
		}
		
		//파일 외 폼값을 DTO에 저장한다.
		MVCBoardDTO dto = new MVCBoardDTO();
		dto.setName(req.getParameter("name"));
		dto.setTitle(req.getParameter("title"));
		dto.setContent(req.getParameter("content"));
		dto.setPass(req.getParameter("pass"));
		
		//첨부파일이 정상적으로 등록되어 원본파일명이 반환되었다면..
		if(originalFileName != "") {
			//파일명을 "날짜_시간.확장자" 형식으로 변경하고..
			String savedFileName = FileUtil.renameFile(saveDirectory, 
					originalFileName);
			
			//원본파일명과 저장된 파일명을 DTO에 저장한다.
			dto.setOfile(originalFileName);
			dto.setSfile(savedFileName);
		}
		
		//DAO를 통해 DB에 값을 입력한다.
		MVCBoardDAO dao = new MVCBoardDAO();
		int result = dao.insertWrite(dto);
		dao.close();
		
		//insert에 성공한 경우에는 목록으로 이동하고 실패이면 쓰기페이지로 이동
		if (result == 1) {
			resp.sendRedirect("./release-list.do");
		}
		else {
			JSFunction.alertLocation(resp, "글쓰기에 실패했습니다", 
					"./write.do");
		}
	}
}
