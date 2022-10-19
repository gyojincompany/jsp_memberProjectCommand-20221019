<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>
</head>
<body>
	<%
		if(session.getAttribute("validMember") == null) { //로그인 안한 상태
	%>			
		<a href="login.jsp">로그인으로 가기</a>
	<%
		} else {
		String id = (String) session.getAttribute("memberId");
		out.println(id + "님 로그인 중");
	%>
		<br><br>
		<a href="logout.do">로그아웃</a>
		<br><br>
		<a href="modify.jsp">회원정보수정</a>
		<br><br>
		<a href="deleteMember.jsp">회원탈퇴</a>
		
		<br><br>
		<hr>
		command 패턴을 사용한 회원 탈퇴<br>
		<form action="deleteMember.do">
			<input type="text" value="<%= id %>" name="d_id">
			<input type="submit" value="회원탈퇴">
		
		</form>	
		
	<%
		} 
	%>
</body>
</html>