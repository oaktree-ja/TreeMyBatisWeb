package com.tmybatis.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


import com.tmybatis.member.model.service.MemberService;
import com.tmybatis.member.model.vo.Member;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/member/mypage")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService mService = new MemberService();
		//HttpSession 객체를 가져옴
		HttpSession session = request.getSession();
		//세션에 저장된 정보를 가져와야함 getAttribute() 를 사용
		//getAttribute() 는 object로 받음 
		Object obj = session.getAttribute("result");
		Member searchOne = (Member)session.getAttribute("result");
		if(searchOne != null) {
			String memberId = searchOne.getMemberId();
			Member member = mService.selectOneById(memberId);
			//String mId = (String)session.getAttribute("memberId");
			//String memberId = (String)(request.getSession()).getAttribute("memberId");
			if(member != null) {
				request.setAttribute("member", member);			
				request.getRequestDispatcher("/WEB-INF/views/member/mypage.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/WEB-INF/views/common/error/error.jsp").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("/WEB-INF/views/common/error/error.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
