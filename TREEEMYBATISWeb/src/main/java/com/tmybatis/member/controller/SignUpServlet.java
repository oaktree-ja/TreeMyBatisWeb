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
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/member/signup")
public class SignUpServlet extends HttpServlet {
	 static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/member/signup.jsp").forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String memberId = request.getParameter("memberId");
		 String memberPwd = request.getParameter("memberPwd");
		 String memberName= request.getParameter("memberName");
		 String gender= request.getParameter("gender");
		 int    age= Integer.parseInt(request.getParameter("age"));
		 String email= request.getParameter("email");
		 String phone= request.getParameter("phone");
		 String address= request.getParameter("address");
		 String hobby= request.getParameter("hobby"); 
		 Member member = new Member(memberId, memberPwd, memberName, gender, age, email, phone, address, hobby);
		 
		 int result = new MemberService().insertMember(member);
			if(result > 0) {
				// ȸ������ ���� -> �α��� �������� �̵� (/WEB-INF/views/member/login.jsp) -> /member/login
//				request.getRequestDispatcher("/WEB-INF/views/member/login.jsp")
//				.forward(request, response);
				response.sendRedirect("/member/login"); // get��û -> doGet�� �����Ұ���.
			}else {
				// ȸ������ -> ������������ �̵�(/WEB-INF/views/common/error/error.jsp)
				request.getRequestDispatcher("/WEB-INF/views/common/error/error.jsp")
				.forward(request, response);
			}
			
		}
	}


