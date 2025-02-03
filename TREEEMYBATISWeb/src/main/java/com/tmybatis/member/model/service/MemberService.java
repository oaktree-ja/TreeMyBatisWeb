package com.tmybatis.member.model.service;

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

	public Member selectOneById(String memberId) {
		Member member = mDao.selectOneById(conn,memberId);
		return member;
	}

	public int updateMember(Member member) {
		
		int result = mDao.updateMember(conn,member);
		return result;
	}

	public int deleteMember(String memberId) {
		int result = mDao.deleteMember(conn,memberId);
		return result;
	}

	

	

	
	

}
	
