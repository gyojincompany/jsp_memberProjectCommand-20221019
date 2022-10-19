package com.gyojincompany.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MLoginCommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		MemberDao dao = new MemberDao();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		int flag = dao.userCheck(id, pw);
		
		if(flag == 1) {
			System.out.println("로그인 성공!");
		} else if(flag == 0) {
			System.out.println("회원아님 로그인 실패!");
		} else {
			System.out.println("아이디는 맞지만 비밀번호 틀림!");
		}
	}
}
