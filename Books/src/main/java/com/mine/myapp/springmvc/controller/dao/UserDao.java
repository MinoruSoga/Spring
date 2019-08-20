package com.mine.myapp.springmvc.controller.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mine.myapp.springmvc.form.LoginForm;
import com.mine.myapp.springmvc.logic.LoginInfo;

public class UserDao {
	
	LoginForm loginForm = new LoginForm();
	LoginInfo loginInfo = null;
	String url = "jdbc:mysql://localhost/books";
	String id = "root";
	String pass = "Minoru_2021";
	java.sql.Connection cnct = null;
	java.sql.Statement st = null;
	java.sql.ResultSet rs = null;
	java.sql.PreparedStatement pst = null;
	
	public LoginInfo select(String email, String password)throws SQLException{
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnct = DriverManager.getConnection(url,id,pass);
			System.out.println("接続完了");
			String quary = "select * from user where email = ? and password = ?";
			pst = cnct.prepareStatement(quary);
			pst.setString(1, email);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if(rs.next()) {
				loginInfo = new LoginInfo();
				loginInfo.setEmail(email);
				loginInfo.setPassword(password);
			}
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("クラスが見つかりません");
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("接続失敗");
		}finally {
			if(cnct!=null)cnct.close();
			if(rs!=null)rs.close();
			if(pst!=null)pst.close();
			if(st!=null)st.close();
		}
		return loginInfo;
	}
}
