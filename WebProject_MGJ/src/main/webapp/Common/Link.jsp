<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1" width="90%"> 
    <tr>
        <td align="center">
        <!-- 로그인 여부에 따른 메뉴 변화. session 영역에
        인증관련 속성이 없다면 로그아웃 상태이므로 '로그인'
        링크를 출력한다. -->
        <% if (session.getAttribute("UserId") == null) { %>
            <a href="../login.jsp">로그인</a>
        <% } else { %>
            <a href="../Logout.jsp">로그아웃</a>
        <% } %>
            &nbsp;&nbsp;&nbsp; 
            <a href="../release-list.jsp">게시판(페이징X)</a>
        </td>
    </tr>
</table>

