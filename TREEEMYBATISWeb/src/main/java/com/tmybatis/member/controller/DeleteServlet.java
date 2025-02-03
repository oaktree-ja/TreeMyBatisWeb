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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/member/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService mService = new MemberService();
		HttpSession session = request.getSession();
		Member searchOne =(Member)session.getAttribute("result");
		if(searchOne !=null) {
			String memberId = searchOne.getMemberId();
			
			
			int result = mService.deleteMember(memberId);
			if(result >0) {
				//���� ���� �� ������������ �̵��ϴ¤��� ���� ���� �ı�
				
				response.sendRedirect("/member/logout");
			}else {
				//Ż�� ���� ������������ �̵�
				request.getRequestDispatcher("/WEB-INF/views/common/error/error.jsp").forward(request, response);
			}
		}
			
		}
		
	}

