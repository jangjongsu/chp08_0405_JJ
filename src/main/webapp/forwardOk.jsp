<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forwardOk</title>
</head>
<body>
	저는 forward.jsp 로 부터 포워딩된 forwardOk.jsp 입니다.<br>
	<%
	String id = request.getParameter("memberId");
	String pw = request.getParameter("memberPw");
	%>
	Id는 <%= id %> 이며, pw는 <%=pw %> 입니다.
	
	
</body>
</html>