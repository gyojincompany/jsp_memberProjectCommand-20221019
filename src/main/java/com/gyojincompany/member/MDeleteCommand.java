package com.gyojincompany.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MDeleteCommand {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		MemberDao dao = new MemberDao();
		String id = request.getParameter("d_id");
		
		int flag = dao.delete(id);
		
		if(flag == 1) {
			System.out.println("회원탈퇴 성공!");
		} else {
			System.out.println("회원탈퇴 실패!");
		}
	}
}
