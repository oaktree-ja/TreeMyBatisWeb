package com.tmybatis.notice.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.tmybatis.member.common.NavigationUtill;
import com.tmybatis.notice.model.service.NoticeService;
import com.tmybatis.notice.model.vo.Notice;


/**
 * Servlet implementation class ListServlet
 */
@WebServlet("/notice/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NoticeService nService = new NoticeService();
		List<Notice>nList = nService.selectListAll();
		if(nList.size()>0) {
			request.setAttribute("nList", nList);
			request.getRequestDispatcher("/WEB-INF/views/notice/list.jsp")
			.forward(request, response);
		}else {
			NavigationUtill.navigateToError(request, response, "404","�����Ͱ� �������� �ʽ��ϴ�");
		}
		
	}

}
