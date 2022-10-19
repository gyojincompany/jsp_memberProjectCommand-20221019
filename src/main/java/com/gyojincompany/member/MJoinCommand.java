package com.gyojincompany.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MJoinCommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		
		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPw(pw);
		dto.setUsername(username);
		dto.setEmail(email);
		
		MemberDao dao = new MemberDao();
		
		int flag = dao.insertMember(dto);
		
		if(flag == 1) {
			System.out.println("회원가입 성공!");
		} else {
			System.out.println("회원가입 실패!");
		}
	}
}
