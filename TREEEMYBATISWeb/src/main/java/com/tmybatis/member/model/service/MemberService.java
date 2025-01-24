package com.tmybatis.member.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.tmybatis.member.common.JDBCTemplate;
import com.tmybatis.member.common.SqlSessionTemplate;
import com.tmybatis.member.model.dao.MemberDAO;
import com.tmybatis.member.model.vo.Member;
public class MemberService {

	private JDBCTemplate jdbcTemplate;
	private SqlSession conn;
	private MemberDAO mDao;

	public MemberService() {
		conn = SqlSessionTemplate.getSqlSession();
		jdbcTemplate = JDBCTemplate.getInstance();
		mDao = new MemberDAO();
	}

	public Member selectOneByLogin(Member member) {
		Member result = mDao.selectOneByLogin(conn, member);
		return result;
		
		
//		//Connection conn = null;
//		Member result = null;
//		try {
//			//conn = jdbcTemplate.getConnection();
//			result = mDao.selectOneByLogin(conn, member);
//		} catch (SQLException e) {                                                                                                                                                                                                               
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		return result;
	}

	public int insertMember(Member member) {
		int result = mDao.insertMember(conn,member);
		return result;
	}

	

}
	
