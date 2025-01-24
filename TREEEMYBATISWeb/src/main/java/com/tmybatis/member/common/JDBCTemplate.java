package com.tmybatis.member.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	
	//JDBCTemplate按眉 - 教臂 沛 利侩
	
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "student";
	private static final String PASSWORD = "student";
	private static JDBCTemplate instance;
	
	private JDBCTemplate()  {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static JDBCTemplate getInstance(){
		if(instance == null)
			instance = new JDBCTemplate();
		return instance;
	}
	//楷搬 积己 皋家靛 -getConnection() 积己
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
	

}
