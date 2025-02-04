package com.tmybatis.notice.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.tmybatis.notice.model.vo.Notice;

public class NoticeDAO {

	public int insertNotice(SqlSession session, Notice notice) {
		int result = session.insert("NoticeMapper.insertNotice",notice);
		return result;
	}

	public List<Notice> selectListALL(SqlSession session) {
		List<Notice> nList = session.selectList("NoticeMapper.selectListAll");
		return nList;
	}

}
