package com.gyojincompany.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MIdCheckCommand implements MCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		
		MemberDao dao = new MemberDao();
		int flag = dao.idCheck(id);
		
		if(flag == 1) {
			System.out.println("가입하시려는 아이디가 존재합니다.");
		} else {
			System.out.println("가입하실 수 있는 아이디입니다.");
		}
		
	}

}
