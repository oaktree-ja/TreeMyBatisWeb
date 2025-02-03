package com.tmybatis.member.controller;

import java.io.IOException;

import com.tmybatis.member.model.service.MemberService;
import com.tmybatis.member.model.vo.Member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/login.jsp");
		view.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService mService = new MemberService();
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		Member member = new Member(memberId, memberPw);
		Member result = new MemberService().selectOneByLogin(member);
		if(result != null) {
			HttpSession session = request.getSession(); // ������ ����(�������)
			session.setAttribute("result", result);
			
			
			// �α��� ����! -> ���������� �̵�, �Խ��� ������ �̵�
			// http://localhost:8888/, 			http://localhost:8888/board
			// url�� �̿��� ������ �̵��� response ��ü ���
			response.sendRedirect("/"); // sendRedirect() �޼ҵ� ȣ��
		}else {
			// �α��� ����.. -> error.jsp�� �̵�
			request.getRequestDispatcher("/WEB-INF/views/common/error/error.jsp")
			.forward(request, response);
		}
	}

	
}
