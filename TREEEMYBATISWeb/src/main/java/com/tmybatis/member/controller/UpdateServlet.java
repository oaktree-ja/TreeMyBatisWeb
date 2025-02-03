package com.tmybatis.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.tmybatis.member.model.service.MemberService;
import com.tmybatis.member.model.vo.Member;



/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/member/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = request.getParameter("memberId");
		String email	= request.getParameter("email");
		String phone	= request.getParameter("phone");
		String address  = request.getParameter("address");
		String hobby	= request.getParameter("hobby");
		Member member = new Member(memberId, email, phone, address, hobby);
		MemberService mService = new MemberService();
		int result = mService.updateMember(member);
		if(result > 0) {
			response.sendRedirect("/member/mypage");
			//������ ������������ �̵� /����������
		}else {
			// ������Ʈ ����
			request.getRequestDispatcher("/WEB-INF/views/common/error/error.jsp")
			.forward(request, response);
		}
		
	
	}

}
